import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        int hash = 2000000;
        int n = scan.nextInt();
        int memory[] = new int[hash];
        int num;
        for(int i=0; i<n; i++)
        {
            String command = scan.next();
            switch(command)
            {
                case "insert":
                    num=scan.nextInt();
                    memory[num%hash]++;
                    list.addFirst(num);
                    break;
                case "delete":
                    num=scan.nextInt();
                    if(memory[num%hash]>0)
                    {
                        num=list.indexOf(num);
                        list.remove(num);
                    }
                    break;
                case "deleteFirst":
                    memory[list.getFirst()%hash]--;
                    list.removeFirst();
                    break;
                case "deleteLast":
                    memory[list.getLast()%hash]--;
                    list.removeLast();
                    break;
                default:
                    break;
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