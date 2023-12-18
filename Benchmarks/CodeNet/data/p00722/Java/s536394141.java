import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] numbers = new int[1000001];
    	for(int i=0;i<=1000000;i++) {
    		numbers[i] = 0;
    	}
    	numbers[0] = 1;
    	numbers[1] = 1;
    	for(int i=2;i<=1000000/2;i++) {
    		for(int j=2;j<=1000000/i;j++) {
    			numbers[i*j] = 1;
    		}
    	}
    	while(true) {
    		int a = sc.nextInt();
    		int d = sc.nextInt();
    		int n = sc.nextInt();
    		if(a+d+n==0) break;
    		int count = 0;
    		loop:for(int i=a;;i+=d) {
    			if(numbers[i] == 0) count++;
    			if(count == n) {
    				System.out.println(i);
    				break loop;
    			}
    		}
    	}
    }
}

