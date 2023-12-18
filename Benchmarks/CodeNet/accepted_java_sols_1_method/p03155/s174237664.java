import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),h=sc.nextInt(),w=sc.nextInt();
		
		System.out.println((n-h+1)*(n-w+1));
	}
}

