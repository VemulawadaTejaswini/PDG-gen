import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int array[] = new int[n];
    	long sum = 0;
    	for(int i = 0; i < n; i ++) {
    		array[i] = sc.nextInt();
    		sum = sum + array[i];
    	}
    	Arrays.sort(array);
    	System.out.printf("%d %d %d\n", array[0], array[n-1], sum);
    }
}
