import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++)
        {
            String command = scan.next();

            if(command.equals("insert"))
            {
                list.addFirst(scan.nextInt());
            }
            else if(command.equals("delete"))
            {
                int num=list.indexOf(scan.nextInt());
                if(num!=-1)
                {
                    list.remove(num);
                }
            }
            else if(command.equals("deleteFirst"))
            {
                    list.removeFirst();
            }
            else
            {
                list.removeLast();
            }
        }
        for(int i=0; i<list.size(); i++)
        {
            System.out.printf("%d",list.get(i));
            if(i<list.size()-1)
            {
                System.out.printf(" ");
            }
        }
        System.out.println();
    }
}