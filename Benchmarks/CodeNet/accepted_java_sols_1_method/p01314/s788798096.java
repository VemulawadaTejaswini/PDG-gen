import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int n = sc.nextInt();
    		if(n==0) break;
    		int count = 0;
    		for(int i=1;i<=n/2;i++) {
    			int sum = 0;
    			int a = i;
    			while(sum<n) {
    				sum += a++;
    			}
    			if(sum == n) count++;
    		}
    		System.out.println(count);
        }
    }
}
