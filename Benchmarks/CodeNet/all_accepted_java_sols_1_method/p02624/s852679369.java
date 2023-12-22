import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N+1];
        Arrays.fill(arr, 1);
        for (int i = 2; i < arr.length; i++) {
        	int num = i;
        	while (num < arr.length) {
        		arr[num]++;
        		num += i;
        	}
        }
        long count = 0;
        for (int i = 1; i < arr.length; i++) {
        	count += i*arr[i];
        }
        System.out.println(count);
    }
}