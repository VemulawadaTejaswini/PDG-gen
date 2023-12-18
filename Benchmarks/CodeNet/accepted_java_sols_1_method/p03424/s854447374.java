import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] ans=new int[4];
		for(int j=0;j<4;j++) ans[j]=0;
		String cate="null";
		int num=0; 
		for(int i=0;i<N;i++){
			String s=sc.next();
			if(s.equals("G")) ans[0]=1;
			else if(s.equals("W")) ans[1]=1;
			else if(s.equals("P")) ans[2]=1;
			else if(s.equals("Y")) ans[3]=1;
		}

		for(int j=0;j<4;j++){
			if(ans[j]==1) num++;
		}
		
		if(num==3) cate="Three";
		else if(num==4) cate="Four";

		System.out.println(cate);
	}
}