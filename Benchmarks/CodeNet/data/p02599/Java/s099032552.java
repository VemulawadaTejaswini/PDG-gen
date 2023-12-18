import java.util.*;
import java.io.*;
import java.math.*;
class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int qi=0;qi<Q;qi++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>(); 
            for(int i=a-1;i<b;i++)
            {
                if(!list.contains(arr[i]))
                {
                    list.add(arr[i]);
                }
            }
            System.out.println(list.size());
        }
        
    }
}