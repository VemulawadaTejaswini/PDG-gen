import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            String input = scan.next();
            int num2,num1;

            if(input.equals("+"))
            {
                num2 = Integer.parseInt(formula.poll());
                num1 = Integer.parseInt(formula.poll());
                formula.push(String.valueOf(num1+num2));
            }
            else if(input.equals("*"))
            {
                num2 = Integer.parseInt(formula.poll());
                num1 = Integer.parseInt(formula.poll());
                formula.push(String.valueOf(num1*num2));
            }
            else if(input.equals("-"))
            {
                num2 = Integer.parseInt(formula.poll());
                num1 = Integer.parseInt(formula.poll());
                formula.push(String.valueOf(num1-num2));                
            }
            else if(input.equals("="))
            {
                break;
            }
            else
            {
                formula.push(input);
            }
            int size = formula.size();
            for(int i = 0; i<size; i++)
            {
                String p = formula.pollLast();
//                System.out.printf("%s ",p);
                formula.push(p);
            }
//            System.out.println();
        }
        System.out.println(formula.poll());
    }
}