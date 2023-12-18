import java.util.Scanner;
import java.util.Stack;

import javax.lang.model.util.ElementScanner6;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        char garbage[] = new char[2];
        
        while(true)
        {
            String answer="yes";
            String input = sc.nextLine();
            if(input.equals(".")) break;
            char cinput[] = input.toCharArray();

            for(int i=0; i<input.length(); i++)
            {
                if(cinput[i]==')')
                {
                    if(stack.empty()) answer="no";
                    else if(stack.peek()=='(')
                    {
                        stack.push(cinput[i]);
                        garbage[0] = stack.pop();
                        garbage[1] = stack.pop();
                    }
                    else answer="no";
                }
                else if(cinput[i]==']')
                {
                    if(stack.empty()) answer="no";
                    else if(stack.peek()=='[')
                    {
                        stack.push(cinput[i]);
                        garbage[0] = stack.pop();
                        garbage[1] = stack.pop();
                    }
                    else answer="no";
                }
                else if (cinput[i]=='(' || cinput[i]=='[') stack.push(cinput[i]);
            }
            
            if(!stack.empty()) answer="no";
            System.out.println(answer);

            stack.clear();
        }
        sc.close();
    }
}
