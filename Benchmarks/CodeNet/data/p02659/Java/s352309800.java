import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	double b = sc.nextDouble();
	long b100 = (long)(b*100);
	System.out.print((long)(a*b100/100));
    }
}
