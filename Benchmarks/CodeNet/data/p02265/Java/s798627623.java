import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(System.in);
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> list = new ArrayDeque<Integer>();
        int num;
        for(int i=0; i<n; i++)
        {
            String command = br.readLine();
//            String command = scan.next();
            switch(command.charAt(0))
            {
                case 'i':
                    list.offerFirst(Integer.parseInt(command.charAt(7)));
                    break;
                case 'd':
                    if(command.length()>6)
                    {
                        switch(command.charAt(6))
                        {
                            case 'F':
                                list.pollFirst();
                                break;
                            case 'L':
                                list.pollLast();
                                break;
                            default:
                                break;
                        }
                    }
                    else
                    {
                        list.remove((Integer)string.charAt(7));
                    }
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