import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        long ans = 0;
        long wCount = 0;
        for (int i = S.length()-1; i >= 0; i--) {
        	if (S.charAt(i) == 'B') {
        		ans += wCount;
        	} else {
        		wCount++;
        	}
        }
        
        System.out.println(ans);
    }
}	