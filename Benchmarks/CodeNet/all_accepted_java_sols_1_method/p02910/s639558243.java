import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean flg = true;
        for (int i = 0; i < S.length(); i++) {
        	if ((i%2 == 0 && S.charAt(i) == 'L') || 
        			(i%2 != 0 && S.charAt(i) == 'R')) {
        		flg = false;
        	} 
        }
        System.out.println(flg ? "Yes" : "No");
    }
}