import java.util.*;

public class Main {
    public static  void main(String  args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int max = x;
        int min = x;
        long sum = x;
        for (int i = 1; i < n; i++) {
        	x = sc.nextInt();
        	if (max < x) max = x;
        	if (min > x) min = x;
        	sum += x;
	
        }
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}