import java.util.*;
public class Main {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] list=new int[n];
		long[][] result =new long[n][21];
		for(int i=0;i<n;i++)list[i]=sc.nextInt();
		result[0][list[0]]=1;
		for(int i=0;i<n-2;i++){
			for(int j=0;j<21;j++){
				if(result[i][j]!=0&&j+list[i+1]<=20)result[i+1][j+list[i+1]]+=result[i][j];
				if(result[i][j]!=0&&j-list[i+1]>=0)result[i+1][j-list[i+1]]+=result[i][j];
			}
		}
		System.out.println(result[n-2][list[n-2]]);
		for(int i=0;i<n;i++){
			System.out.println(""+list[i]+"  ");
			for(int j=0;j<21;j++){
				System.out.print(" "+result[i][j]);
			}
			System.out.println();
		}
	}

}