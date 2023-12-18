import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int ans=0,max=0;
		for(int i=0;i<N; i++) {
			int p = sc.nextInt();
			ans+=p;
			if(max < p) max= p;
		}
		System.out.println(ans-max/2);
	}
}
