import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		    String text = sc.next();
		    if ("-".equals(text)) {
		        break;
		    }
		    //行数
		    int n = sc.nextInt();
		    for (int i = 0; i < n; i++) {
		        int x = sc.nextInt();
		        String s1 = text.substring(0, x);
		        String s2 = text.substring(x);
		        text = s2 + s1;
		    }
            System.out.println(text);
		}
		
        
		
		
    }
}

