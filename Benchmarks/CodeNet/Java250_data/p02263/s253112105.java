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
                    input = String.valueOf(Double.parseDouble(formula.poll())+Double.parseDouble(formula.poll()));
                    break;
                case "-":
                    input = String.valueOf(-1*Double.parseDouble(formula.poll())+Double.parseDouble(formula.poll()));                    
                    break;
                case "/":
                    input = String.valueOf(1.0/Double.parseDouble(formula.poll())*Double.parseDouble(formula.poll()));
                    break;
                case "*":
                    input = String.valueOf(Double.parseDouble(formula.poll())*Double.parseDouble(formula.poll()));
                    break;
            }
            formula.push(input);
        }
        double ans = Double.parseDouble(formula.poll());
        if(ans==(int)ans){
            System.out.println((int)ans);
        }else{
            System.out.println(ans);
        }
    }
}