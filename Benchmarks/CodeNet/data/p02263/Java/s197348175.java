import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            if((args[0]=scan.next()).equals("+")) args[0] = String.valueOf(Integer.parseInt(formula.poll())+Integer.parseInt(formula.poll()));
            else if(args[0].equals("-")) args[0] = String.valueOf(-1*Integer.parseInt(formula.poll())+Integer.parseInt(formula.poll()));
            else if(args[0].equals("*")) args[0] = String.valueOf(Integer.parseInt(formula.poll())*Integer.parseInt(formula.poll()));
            formula.push(args[0]);
        }
        System.out.println(formula.poll());
    }
}