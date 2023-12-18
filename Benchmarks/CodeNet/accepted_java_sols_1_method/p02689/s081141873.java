import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 int M=sc.nextInt();
		 int observatory[][]=new int[N][2];
		 for(int i=0;i<N;i++) {
			 observatory[i][0]=sc.nextInt();
			 observatory[i][1]=0;
		 }
		 for(int i=0;i<M;i++) {
			 int a=sc.nextInt()-1;
			 int b=sc.nextInt()-1;
			 if(observatory[a][0]<=observatory[b][0]) {
				 observatory[a][1]=1;
			 }if(observatory[a][0]>=observatory[b][0]) {
				 observatory[b][1]=1;
			 }
		 }
		 int count=0;
		 for(int i=0;i<N;i++) {
			 if(observatory[i][1]==0)
				 count++;
		 }
	     System.out.println(count);
	     sc.close();
	 }
}
