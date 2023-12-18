import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int H[]=new int[N];
		long sum=0;
		if(N<=K){
			System.out.println(0);
			System.exit(0);
		}
		for(int i=0;i<N;i++){
			H[i]=stdIn.nextInt();
			sum+=H[i];
		}
		Arrays.sort(H);
		for(int i=0;i<K;i++){
			sum-=H[N-1-i];
		}
		System.out.println(sum);
	}
}
