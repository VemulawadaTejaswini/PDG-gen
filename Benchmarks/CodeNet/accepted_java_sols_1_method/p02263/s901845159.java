import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> calc = new Stack<>();
        String n = scan.nextLine();
        for(int r = 0; r < n.length(); r++){
            if(n.charAt(r) == ' '){
            }
            else if(n.charAt(r) == '+' || n.charAt(r)== '-' || n.charAt(r)== '*' || n.charAt(r)== '/'){
                int y = calc.pop();
                int x = calc.pop();
                if(n.charAt(r)== '+'){
                    x = x + y;
                    calc.push(x);
                }
                else if(n.charAt(r)== '-'){
                    x = x - y;
                    calc.push(x);
                }
                else if(n.charAt(r)== '*'){
                    x = x * y;
                    calc.push(x);
                }
                else{
                    x = x/y;
                    calc.push(x);
                }
            }
            else{
                String num = "";
                for(int p = r; p < n.length(); p++) {
                    if(Character.isDigit(n.charAt(p))){
                        num = num + Character.toString(n.charAt(p));
                    }
                    else{
                        r = p;
                        p = n.length();
                    }
                }
                calc.push(Integer.parseInt(num));
            }
        }
        System.out.println(calc.pop());
    }
}
