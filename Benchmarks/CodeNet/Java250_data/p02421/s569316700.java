import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, taro = 0, hanako = 0;
        String tc, hc;
        
        n = sc.nextInt();
        
        for(i = 0; i < n; i++) {
        	tc = sc.next();
        	hc = sc.next();
        	
        	if(tc.compareTo(hc) > 0) {
        		taro += 3;
        	} else if (tc.compareTo(hc) < 0) {
        		hanako += 3;
        	} else {
        		taro++;
        		hanako++;
        	}
        	
        }
        
        System.out.println(taro + " " + hanako);
        
    }
}
