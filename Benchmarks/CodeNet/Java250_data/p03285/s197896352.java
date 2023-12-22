import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solve(n));
		sc.close();
		return ;
    }
    
    static String solve(int n) {
    	for (int i = 0; i < 26; i++) {
    		for (int j = 0; j < 20; j++) {
    			if (4*i + 7*j == n) {
    				return "Yes";
    			}
    		}
    	}
    	return "No";
    }
    
    
}
