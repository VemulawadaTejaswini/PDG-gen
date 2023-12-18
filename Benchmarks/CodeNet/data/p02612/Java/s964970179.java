import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
        int r = n % 1000;
		if (r == 0) {
			System.out.println(r);
		} else {
          	System.out.println(1000 - r);
        }
	}
}






