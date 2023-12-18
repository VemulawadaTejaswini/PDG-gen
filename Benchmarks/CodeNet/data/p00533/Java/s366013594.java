import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int count=-1;
		char c ='c';
		int[][] an = new int[w+1][h+1];
		for(int i=0;i<h;i++){
			char[] s = sc.next().toCharArray();
			for(int j=0;j<w;j++){
				if(c==s[j]){
					count=0;
					an[j][i]=0;
				}
				else{
					if(count>=0){
						count+=1;
						an[j][i]=count;
					}
					else an[j][i]=count;
				}
			}
			count=-1;
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print(an[j][i]);
				if(j==w-1) System.out.println();
			}
		}
    }
}