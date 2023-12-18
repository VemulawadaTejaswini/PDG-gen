import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i, m, h;
        
        while(true) {
        	str = sc.next();
        	if(str.equals("-")) break;
        	m = sc.nextInt();
        	
        	for(i = 0; i < m; i++) {
        		h = sc.nextInt();
        		str = str.substring(h).concat(str.substring(0, h));
        	}
        	System.out.println(str);
        }
    }
}
