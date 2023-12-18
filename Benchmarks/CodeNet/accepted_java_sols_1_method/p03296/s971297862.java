
import java.util.Scanner;

public class Main {
	public static int N = 0;
	public static int magic = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int a[] = new int[N];
		
		for(int i = 0;i < N;i++) {
			a[i] = scan.nextInt();
		}
	
		for(int i = 0;i < N - 1;i++) {
			int count = 1;
			while(a[i] == a[i+1]) {
				count++;
				i++;
				if(i == N - 1)break;
			}
			magic += count / 2;
		}
		
		scan.close();
		System.out.println(magic);
	}
}

