import java.util.*;
    public class Main{
        public static void main(String[] arg){
            int a, b, c;
            c = 0;
        	Scanner scan = new Scanner(System.in);
            for(;;){
                a = scan.nextInt();
                String op = scan.next();
                b = scan.nextInt();
                if(op.equals("?")) break;
                if(op.equals("+")){
                    c = a + b;
                }else if(op.equals("-")){
                    c = a - b;
                }else if(op.equals("*")){
                	c = a * b;
                }else if(op.equals("/")){
                    c = a / b;
                }
                System.out.printf("%d\n", c);
            }
            scan.close();
        }
    }
