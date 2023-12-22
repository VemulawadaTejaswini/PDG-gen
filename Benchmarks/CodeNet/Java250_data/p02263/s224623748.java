import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void solve(){
        Scanner scan = new Scanner(System.in);
        String expression;
        
        expression = scan.nextLine();
        String[] symbols = expression.split(" ");
        Stack<Integer> operands = new Stack<Integer>();
        
        for(String s: symbols){
            if(s.equals("+")){
                int a = operands.pop();
                int b = operands.pop();
                int res = b + a;
                operands.push(res);
            }else if(s.equals("-")){
                int a = operands.pop();
                int b = operands.pop();
                int res = b - a;
                operands.push(res);
            }else if(s.equals("*")){
                int a = operands.pop();
                int b = operands.pop();
                int res = b * a;
                operands.push(res);
            }else{
                int x = (int)Integer.parseInt(s);
                operands.push(x);
            }
        }
        int x = operands.pop();
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        solve();
    }
    
}

