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
            int num = scan.nextInt();
            switch(command)
            {
                case "insert":
                    list.add(num);
                    break;
                case "delete":
                    list.remove(list.indexOf(num));
                    break;
                case "deleteFirst":
                    list.removeFirst();
                    break;
                case "deleteLast":
                    list.removeFirst();
                    break;
                default:
                    break;
            }
        }
        for(int i=0; i<list.size(); i++)
        {
            System.out.printf("%d",list.get(list.size()-i-1));
            if(i!=list.size()-1)
            {
                System.out.printf(" ");
            }
        }
    }
}