import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next().toUpperCase();
		int cnt = 0;
		while (true) {
		    String s = sc.next();
		    if ("END_OF_TEXT".equals(s)) {
		        break;
		    } 
		    if (text.equals(s.toUpperCase())) {
		        cnt++;
		    }
		}
		
        
		System.out.println(cnt);
		
    }
}


