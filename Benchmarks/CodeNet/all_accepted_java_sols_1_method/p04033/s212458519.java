import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    int negative_count = 0;
		for(long i = a; i <= b; i++) {
			if(i==0) {
				System.out.println("Zero");
				return;
			}
			if(i < 0) {
				negative_count++;
			}
		}
		if(negative_count%2 == 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
}
      