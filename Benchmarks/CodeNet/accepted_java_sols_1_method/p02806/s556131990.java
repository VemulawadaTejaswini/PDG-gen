import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String A[]=new String[N];
		int B[]=new int[N];
		boolean key=false;
		int ans=0;
		for(int i=0;i<N;i++){
			A[i]=stdIn.next();
			B[i]=stdIn.nextInt();
		}
		String S=stdIn.next();
		for(int i=0;i<N;i++){
			if(key)
				ans+=B[i];
			if(S.equals(A[i]))
				key=true;
		}
		System.out.println(ans);
	}
}
