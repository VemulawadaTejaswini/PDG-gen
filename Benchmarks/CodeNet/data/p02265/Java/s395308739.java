import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Deque<Integer> list = new ArrayDeque<Integer>();
        int num;
        for(int i=0; i<n; i++)
        {
            String command = scan.next();
            switch(command)
            {
                case "insert":
                    list.offerFirst(scan.nextInt());
                    break;
                case "delete":
                    list.remove((Integer)scan.nextInt());
                    break;
                case "deleteFirst":
                    list.pollFirst();
                    break;
                case "deleteLast":
                    list.pollLast();
                    break;
                default:
                    break;
            }
        }
        while(list.size()>1)
        {
            System.out.printf("%d ",list.poll());
        }
        System.out.println(list.poll());
    }
}