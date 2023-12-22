import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean flag = false;
        String s = sc.next();
        String p = sc.next();
        
        s = s.concat(s);
        
        for(i = 0; i < s.length() - p.length(); i++) {
        	if(p.equals(s.substring(i, p.length() + i))) {
        		flag = true;
        		break;
        	}
        }
        
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
