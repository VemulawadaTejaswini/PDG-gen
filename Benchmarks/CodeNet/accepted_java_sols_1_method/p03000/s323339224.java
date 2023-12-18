import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		int output = 0;
		for(int i = 0;i<N;i++)arr[i]=sc.nextInt();
		int temp = 0;
		if(0<=X)output++;
		for(int i = 0;i<N;i++) {
			temp+=arr[i];
			if(temp<=X)output++;
		}
		System.out.println(output);

	}

}
