import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int c5 = 0;
		int c7 = 0;
		if ( A==5 )c5++; else c7++;
		if ( B==5 )c5++; else c7++;
		if ( C==5 )c5++; else c7++;
		if ( c5==2 && c7==1 ) System.out.println("YES");
		else System.out.println("NO");
	}
}
