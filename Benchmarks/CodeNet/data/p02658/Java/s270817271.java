import java.util.Scanner;
public class Main {
  	public static final long max = (long)Math.pow(10,18);
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
      	long result = 1;
        while (sc.hasNextLong()) {
          long next = sc.nextLong();
          result = result * next;
        }
        if (result > max) {
            System.out.println("-1");
        } else {
          System.out.println(String.valueOf(result));
        }
    }
}
