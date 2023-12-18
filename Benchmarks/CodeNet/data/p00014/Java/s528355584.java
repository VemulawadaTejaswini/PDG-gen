import java.util.*;

public class Main {
    public static int f(int x) {
	return x*x;
    }
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    int d = s.nextInt();
	    int sum = 0;
	    for(int i = d; i <= 600 - d; i += d) {
		sum += f(i);
	    }
	    sum *= d;
	    System.out.println(sum);
	}
    }
}