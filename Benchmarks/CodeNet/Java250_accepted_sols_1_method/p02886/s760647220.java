import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int[] takos=new int[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			takos[i]=sc.nextInt();
		}
		
		long ans=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				ans+=takos[i]*takos[j];
			}
		}
		System.out.println(ans);
	}

}
