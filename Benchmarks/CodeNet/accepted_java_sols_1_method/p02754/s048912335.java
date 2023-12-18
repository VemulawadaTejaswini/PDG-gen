import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	long a = sc.nextLong();
	long b = sc.nextLong();
	System.out.print(n / (a+b) * a + Math.min(n%(a+b), a));
    }
}
