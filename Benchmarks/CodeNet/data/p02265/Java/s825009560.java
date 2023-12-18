import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            int i;
            int n = Integer.parseInt(br.readLine());
            ArrayDeque<String> list = new ArrayDeque<String>();
            String[] num = new String[2];
            String command;
            char c;
            for(i=0; i<n; i++)
            {
                command = br.readLine();
                c = command.charAt(0);
                num = command.split(" ",0);

                if(c == 'd')
                {
                    c = command.charAt(6);
                    if(c == 'F')
                    {
                        list.pollFirst();
                    }
                    else if(c == 'L')
                    {
                        list.pollLast();
                    }
                    else
                    {
                        list.remove(num[1]);
                    }
                }
                else
                {
                    list.offerFirst(num[1]);
                }
            }
            int size = list.size();
            for(i=0; i<size-1; i++)
            {
                System.out.printf("%s ",list.poll());
            }
            System.out.println(list.poll());
        }
        catch(Exception e)
        {
        }
    }
}