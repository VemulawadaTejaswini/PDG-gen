import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int n = sc.nextInt();
    		if(n==0) break;
    		int [] numbers = new int[2*n+1];
    		for(int i=2;i<=2*n;i++) {
    			numbers[i] = 0;
    		}
    		numbers[0] = 1;
    		numbers[1] = 1;
    		for(int i=2;i<=n;i++) {
    			for(int j=2;j<=(2*n)/i;j++) {
    				numbers[i*j] = 1;
    			}
    		}
    		int count = 0;
    		for(int i=n+1;i<=2*n;i++) {
    			if(numbers[i] == 0) count++;
    		}
    		System.out.println(count);
    	}
    }
}

