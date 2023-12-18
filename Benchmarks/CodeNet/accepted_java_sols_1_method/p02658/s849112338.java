import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long A[]=new long[N];
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextLong();
			if(A[i]==0){
				System.out.println(0);
				System.exit(0);
			}
		}
		try{
			long sum=1,key=1;
			key*=Math.pow(10,9);
			key*=Math.pow(10,9);
			for(int i=0;i<N;i++){
				sum=Math.multiplyExact(sum,A[i]);
			}
			if(sum>key)
				System.out.println(-1);
			else
				System.out.println(sum);
		}
		catch(Exception e){
			System.out.println(-1);
		}
	}
}
