import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.next();
            switch(input){
                case "+":
                    formula.push(String.valueOf(Double.parseDouble(formula.poll())+Double.parseDouble(formula.poll())));
                    break;
                case "-":
                    formula.push(String.valueOf(-1*Double.parseDouble(formula.poll())+Double.parseDouble(formula.poll())));                    
                    break;
                case "/":
                    formula.push(String.valueOf(1.0/Double.parseDouble(formula.poll())*Double.parseDouble(formula.poll())));
                    break;
                case "*":
                    formula.push(String.valueOf(Double.parseDouble(formula.poll())*Double.parseDouble(formula.poll())));
                    break;
                default:
                    formula.push(input);
                    break;
            }
        }
        double ans = Double.parseDouble(formula.poll());
        if(ans==(int)ans){
            System.out.println((int)ans);
        }else{
            System.out.println(ans);
        }
    }
}