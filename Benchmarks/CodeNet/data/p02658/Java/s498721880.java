import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long ans=1,key=1;
		key*=1000000000;
		key*=100000000;
		for(int i=0;i<N;i++){
			long A=stdIn.nextLong();
			ans*=A;
			if(ans>key){
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(ans);
	}
}
