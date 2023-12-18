
import java.util.*;
class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            Stack<String> stack = new Stack<String>();
            stack.push("text");
            String txt =sc.nextLine();
            int flag =0;
            if(txt == "")
            {
                break;
            }
            for(int i=0; i<txt.length(); i++)
            {
                switch(txt.charAt(i))
                {
                    case '(':
                        stack.push("(");
                        break;
                    case ')':
                        if(stack.peek()!="(")
                            flag=1;
                        else
                            stack.pop();
                        break;
                    case '[':
                        stack.push("[");
                        break;
                    case ']':
                        if(stack.peek()!="[")
                            flag=1;
                        else
                            stack.pop();
                        break;
                }

            }
            if(flag==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        sc.close();
    }
}