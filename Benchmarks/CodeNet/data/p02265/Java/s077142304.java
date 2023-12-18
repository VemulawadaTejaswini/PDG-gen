import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        int hash = 50000000;
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
                    list.offerFirst(num);
                    break;
                case "delete":
                    num=scan.nextInt();
                    if(memory[num%hash]>0)
                    {
                        list.remove((Integer)num);
                        memory[num%hash]--;
                    }
                    break;
                case "deleteFirst":
                    memory[list.getFirst()%hash]--;
                    list.pollFirst();
                    break;
                case "deleteLast":
                    memory[list.getLast()%hash]--;
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