import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int c = A + B;
    int d = A + (A - 1);
    int e = B + (B - 1);
    int max = 0;
    max = Math.max(c,d);
    max = Math.max(max,e);
    System.out.println(max);
	}
}