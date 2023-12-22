import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for(int i = 0;i<N;i++) {
			input[i]=sc.nextInt();
		}
		int res=Integer.MAX_VALUE;
		for(int i = 0;i<N;i++) {
			int count=0;
			while(input[i]%2==0) {
				input[i]/=2;
				count++;
			}
			if(count<res) {
				res=count;
			}
		}
		System.out.println(res);


	}
}