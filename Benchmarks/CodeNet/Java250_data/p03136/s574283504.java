import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int a [] = new int [N];
		for (int i=0; i<N; i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);
		int temp = 0;
		for (int i=0; i<N-1; i++){
			temp+=a[i];
		}
		
		if (temp>a[N-1])
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();

	}

}
