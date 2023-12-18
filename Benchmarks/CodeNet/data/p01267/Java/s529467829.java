import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int n = sc.nextInt();
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		int x = sc.nextInt();
    		if(n+a+b+c+x == 0) break;
    		
    		int[] slot = new int[n];
    		for(int i=0;i<n;i++) {
    			slot[i] = sc.nextInt();
    		}
    		
    		int count = 0;
    		boolean flag = false; 
    		loop: for(int i=0;i<n;i++) {
    			while(x!=slot[i]) {
    				x = (a*x + b)%c;
    				count++;
    				if(count>10000) {
    					flag = true;
    					break loop;
    				}
    			}
    		}
    		if(flag) System.out.println("-1");
    		else System.out.println(count);
    	}
    }
}

