import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);
        while((String input=scan.Next())!=NULL){
            switch(input){
                case "+":
                    input = String.valueOf(Integer.ParseInt(formula.poll())+Integer.ParseInt(formula.poll()));
                    break;
                case "-":
                    input = String.valueOf(-1*Integer.ParseInt(formula.poll())+Integer.ParseInt(formula.poll()));                    
                    break;
                case "*":
                    input = String.valueOf(Integer.ParseInt(formula.poll())*Integer.ParseInt(formula.poll()));
                    break;
            }
            formula.push(input);
        }
        System.out.println(formula.poll());
    }
}