import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main {
	static   boolean[] ans= new boolean[10];
	static int[] in;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter pr=new PrintWriter(System.out);
		while (sc.hasNext()) {
			int[] in= new int[10];
			String str=sc.next();
			for (int i=0;i<=12;i++)in[(int)(str.charAt(i)-48)]++;
			doing();
			str="";
			for(int i=1 ;i<=9;i++) {
				if (ans[i]){
					str+=i+" ";
				}
			}
			pr.println(str.equals("")?0:str.trim());
		}
		pr.flush();
	}
	static void doing(){
		for (int i=1;i<10;i++){
			for (int j=1;j<10;j++) {
				int[] temp=new int[10];
				for (int k=0;k<10;k++)temp[k]=in[k];
				temp[i]++;
				if (temp[i]>4)  break;
				else if (temp[j]<2)continue;
				else {
					int count=0;
					temp[j]-=2;
					for (int k = 1; k < 10; ) {
						if (temp[k] >= 3) {
							temp[k] -= 3;
							count++;
							continue;
						}
						else if (k<8&&temp[k]>0&&temp[k+1]>0&&temp[k+2]>0){
							temp[k]--;
							temp[k+1]--;
							temp[k+2]--;
							count++;
							continue;
						}
						k++;
					}
					if (count==4){
						ans[i]=true;
						break;
					}
				}
			}
		}


	}

}