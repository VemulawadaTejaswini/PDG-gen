import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 int K=sc.nextInt();
		 int d[]=new int[K];
		 int A[][]=new int[K][N];
		 for(int i=0;i<K;i++) {
			 d[i]=sc.nextInt();
			 for(int count=0;count<d[i];count++) {
				 A[i][count]=sc.nextInt();
			 }
		 }
		 boolean student[]=new boolean[N];
		 for(int i=0;i<N;i++)
			 student[i]=false;
		 for(int i=0;i<K;i++) {
			 for(int count=0;count<N;count++) {
				 if(A[i][count]==0) {}
				 else if(student[A[i][count]-1]==false) 
						student[A[i][count]-1]=true;
			 }
		 }
		 int num=0;
		 for(int i=0;i<N;i++) {
			 if(student[i]==false)
				 num++;
		 }
	     System.out.println(num);
	     sc.close();
	 }
}