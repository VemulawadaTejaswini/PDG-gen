import java.util.*;
import java.io.IOException;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	String m = sc.next();
    	int[][] dp = new int[n][1 << 3];
    	//000 JOI
    	for(int i = 0; i < 1 << 3; i++) {
    		
    		if(B(Integer.toBinaryString(i)).charAt(JOI(m.charAt(0))) == '1' && B(Integer.toBinaryString(i)).charAt(0) == '1') {
    			dp[0][i] = 1;
    		}
    	}
    	
    	for(int i = 1; i < n; i++) {
    		for(int j = 0; j < 1 << 3; j++) {
    			if(B(Integer.toBinaryString(j)).charAt(JOI(m.charAt(i))) == '1') {
    				for(int k = 0; k < 1 << 3; k++) {
    					if((k & j) != 0) {
    						dp[i][j] += dp[i-1][k] % 10007;
    					}
    				}
    			}
    		}
    	}
    	int sum = 0;
    	for(int i = 0; i < 1 << 3; i++) {
    		sum += dp[n-1][i] % 10007;
    	}
    	System.out.println(sum % 10007);
    	
    	
    	
    }
    
    static int JOI(char a) {
    	if(a == 'J') return 0;
    	if(a == 'O') return 1;
    	return 2;
    }
    
    static String B(String a) {
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < 3- a.length(); i++) {
    		sb.append("0");
    	}
    	sb.append(a);
    	return sb.toString();
    }
}