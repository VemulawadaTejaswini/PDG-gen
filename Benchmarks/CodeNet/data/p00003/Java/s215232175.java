import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int[] tri = new int[3];

		int count=Integer.parseInt(br.readLine());

		while(count<0){
			count=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<count;i++){
			str=br.readLine();
			tri[0]=getA(str);
			tri[1]=getB(str);
			tri[2]=getC(str);
			sortTri(tri);
			if(tri[0]*tri[0]+tri[1]*tri[1] == tri[2]*tri[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}


	}

	public static int getA(String str){
		int index,num;
		index = str.indexOf(" ");
		num=Integer.parseInt(str.substring(0,index));
		return num;
	}

	public static int getB(String str){
		int index,num;
		index = str.indexOf(" ");
		num=Integer.parseInt(str.substring(index+1,str.indexOf(" ",2)));
		return num;
	}

	public static int getC(String str){
		int index,num=1;
		index = str.indexOf(" ",2);
		num=Integer.parseInt(str.substring(index+1));
		return num;
	}

	public static void sortTri(int[] num){
		int tmp;
		for(int i=0;i<num.length-1;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
	}

}