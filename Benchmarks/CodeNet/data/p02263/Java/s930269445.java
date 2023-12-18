import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.next();
            String in2 = formula.poll();
            String in1 = formula.poll();
            switch(input){
                case "+":
                    formula.push(String.valueOf(Double.parseDouble(in1)+Double.parseDouble(in2)));
                    break;
                case "-":
                    formula.push(String.valueOf(Double.parseDouble(in1)-Double.parseDouble(in2)));                    
                    break;
                case "/":
                    formula.push(String.valueOf(Double.parseDouble(in1)/Double.parseDouble(in2)));
                    break;
                case "*":
                    formula.push(String.valueOf(Double.parseDouble(in1)*Double.parseDouble(in2)));
                    break;
                default:
                    formula.push(in1);
                    formula.push(in2);
                    formula.push(input);
                    break;
            }
        }
        if(double ans==(int)ans){
            System.out.println((int)ans);
        }else{
            System.out.println(ans);
        }
    }
}