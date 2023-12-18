import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, q, i;
        String str0, str1, str2, cmd, p;
        
        str0 = sc.next();
        str1 = str0;
        q = sc.nextInt();
        
        for(i = 0; i < q; i++) {
        	cmd = sc.next();
        	if(cmd.equals("replace")) {
        		a = sc.nextInt();
        		b = sc.nextInt();
        		p = sc.next();
        		
        		str1 = str0.substring(0, a);
        		str1 = str1.concat(p);
        		str0 = str1.concat(str0.substring(b + 1));
        	} else if (cmd.equals("reverse")) {
        		a = sc.nextInt();
        		b = sc.nextInt();
        		
        		StringBuffer strB = new StringBuffer(str0.substring(a, b+1));
        		str1 = strB.reverse().toString();
        		
        		str2 = str0.substring(0, a);
        		str2 = str2.concat(str1);
        		str2 = str2.concat(str0.substring(b + 1));
        		str0 = str2;
        	} else {
        		a = sc.nextInt();
        		b = sc.nextInt();
        		System.out.println(str0.substring(a, b+1));
        		
        	}
        }
        
    }
}
