import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.next();
            if(input.equals("+")) input = String.valueOf(Integer.ParseInt(formula.poll())+Integer.ParseInt(formula.poll()));
            else if(input.equals("-") input = String.valueOf(-1*Integer.ParseInt(formula.poll())+Integer.ParseInt(formula.poll()));
            else if(input.equals("*") input = String.valueOf(Integer.ParseInt(formula.poll())*Integer.ParseInt(formula.poll()));
            formula.push(input);
        }
        System.out.println(formula.poll());
    }
}