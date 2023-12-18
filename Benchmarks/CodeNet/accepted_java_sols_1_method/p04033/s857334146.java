import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		final int a = sc.nextInt();
		final int b = sc.nextInt();

		boolean isZero = false;
		int neg = 0;
		
		for (int i = a; i <= b; i++) {
			if (i < 0){
			    neg++;
			} else if (i == 0){
			    isZero = true;
			}
		}

		if (isZero) {
			System.out.println("Zero");
		} else if (neg % 2 == 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}

		sc.close();
	}
}

