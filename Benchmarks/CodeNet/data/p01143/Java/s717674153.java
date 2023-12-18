import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		int p = sc.nextInt();
    		if(n==0 && m==0 && p==0) break;
    		int uma[] = new int[n+1];
    		int sum = 0;
    		for(int i=1;i<=n;i++) {
    			uma[i] = sc.nextInt();
    			sum += 100*uma[i];
    		}
    		System.err.println(sum);
    		
    		double d = sum*(100-p)/100;
    		System.err.println(d);
    		
    		if(uma[m]==0) {
    			System.out.println("0");
    		}else {
    			System.out.printf("%d",(int)(d/uma[m]));
    			System.out.println();
    		}
    	}
    }
}

