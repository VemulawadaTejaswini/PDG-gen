import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String li;
            try {
                li = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            String[] lisp = li.split(" ");
            int a = Integer.parseInt(lisp[0]);
            int b = Integer.parseInt(lisp[1]);
            int x;
            int y;
            if(a > b) {
                    x = a;
                    y = b;
                }else {
                    x  = b;
                    y = a;
                }
            while(x > 0 && y > 0) {
                int z = x % y;
                x = y;
                y = z;
                if(y == 0) {
                    System.out.println(x + " " + (a / x * b));
                }
            }
        }
    }
 } 
