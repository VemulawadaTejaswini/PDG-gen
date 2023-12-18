import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int x = sc.nextInt();
            char op = sc.next().charAt(0);
            int y = sc.nextInt();  
            if(op == '?') break;
            switch(op) {
                case '+' :  System.out.println(x+y); break;
                case '-' :  System.out.println(x-y); break;
                case '*' :  System.out.println(x*y); break;
                case '/' :  System.out.println(x/y); break;
                default  :  break;
            }    
        }
    }
}
