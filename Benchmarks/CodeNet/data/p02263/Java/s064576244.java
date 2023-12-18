import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        try
        {
            line = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        String[] s = line.split(" ");

        for (int i = 0; i < s.length; i++)
        {
            if ("+".equals(s[i]))
            {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString((op1 + op2)));
            }
            else if ("-".equals(s[i]))
            {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString((op2 - op1)));
            }
            else if ("*".equals(s[i]))
            {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString((op1 * op2)));
            }
            else
            {
                stack.push(s[i]);
            }
        }

        System.out.println(stack.pop());
        scan.close();
    }

}