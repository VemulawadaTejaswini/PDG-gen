import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int sum = 0;
		if (line % 2 == 0) {
		    sum += line / 2;
		} else {
		    sum += line / 2 + 1;
		}
		
		System.out.println(sum);
    }
}

