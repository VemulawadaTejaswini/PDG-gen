import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                        num = command.split(" ",0);
                        list.remove(num[1]);
                    }
                }
                else
                {
                    num = command.split(" ",0);
                    list.offerFirst(num[1]);
                }
            }

        while(list.size()>1)
        {
            System.out.printf("%d ",list.poll());
        }
        System.out.println(list.poll());
        }
        catch(Exception e)
        {
        }
    }
}