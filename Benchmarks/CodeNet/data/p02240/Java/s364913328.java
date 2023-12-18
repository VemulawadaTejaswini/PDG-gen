import java.util.*;
public class ConnectedComponents{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++){
			A[i]=i;
		}
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			A[b]=A[a];
		}
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(A[x]==A[y]){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}
}
