import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int l = str.length();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            char[] newstr = new char[l];
            
            if (command.equals("print")) {
                System.out.println(str.substring(a, b + 1));
            }
            if (command.equals("reverse")) {
                for (int j = 0; j < l; j++) {
                    if (j < a || j > b) {
                        newstr[j] = str.charAt(j);
                    } else {
                        newstr[j] = str.charAt(b - (j - a));
                    }
                }
                str = String.valueOf(newstr);
                //System.out.println("reverse: " + str);
            }
            if (command.equals("replace")) {
                String p = sc.next();
                for (int j = 0; j < l; j++) {
                    if (j < a || b < j) {
                        newstr[j] = str.charAt(j);
                    } else {
                        newstr[j] = p.charAt(j - a);
                    }
                }
                str = String.valueOf(newstr);
                //System.out.println("replace: " + str);
            }
        }

    }
}

