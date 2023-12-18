import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack calc = new Stack();
        while(scan.hasNext()) {
            String n = scan.next();
            if(n.equals("+") || n.equals("-") || n.equals("*") || n.equals("/")){
                int x = (int) calc.pop();
                int y =(int) calc.pop();
                if(n.equals("+")){
                    x = x + y;
                    calc.push(x);
                }
                else if(n.equals("-")){
                    x = x - y;
                    calc.push(x);
                }
                else if(n.equals("*")){
                    x = x * y;
                    calc.push(x);
                }
                else{
                    x = x/y;
                    calc.push(x);
                }
            }
            else{
                calc.push(Integer.parseInt(n));
            }
        }
        System.out.println(calc.pop());
    }
}
