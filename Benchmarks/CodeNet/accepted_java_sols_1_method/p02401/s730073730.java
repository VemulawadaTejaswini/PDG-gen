import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
    	int a, b, ans;
        char op;
        
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        a = Integer.parseInt(str);
        
        str = scan.next();
        op = str.charAt(0);
        
        str = scan.next();
        b = Integer.parseInt(str);
        
        while (true){
            
            if (op == '+'){
                ans = a + b;
                System.out.println(ans);
            }
            else if (op == '-'){
                ans = a - b;
                System.out.println(ans);
            }
            else if (op == '*'){
                ans = a * b;
                System.out.println(ans);
            }
            else if (op == '/'){
                ans = a / b;
                System.out.println(ans);
            }
            else break;
            
            str = scan.next();
            a = Integer.parseInt(str);
            
            str = scan.next();
            op = str.charAt(0);
            
            str = scan.next();
            b = Integer.parseInt(str);
        }
    }
}