import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	long sum = 0;
	for(int i = 0; i < N; ++i) {
	    sum += (long)s.nextInt();
	}
	System.out.println(sum/N);
    }
}