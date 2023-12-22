import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
      	long diff = A + B;
      	if (diff % 2 == 1) {
          System.out.println("IMPOSSIBLE");
        } else {
		  System.out.println(diff / 2);
        }
	}
}