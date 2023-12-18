import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		int a = sc.nextInt();
		int min = a;
		int max = a;
		int sum = a;
    	for(int i = 1;i <= n;i ++) {
    		if(a < min) {
    			min = a;
    		}
    		if(max < a) {
    			max = a;
    		}
    		sum += a;
    		a = sc.nextInt();
    	}
    	System.out.printf("%d %d %d\n", min, max, sum);
    }
}
