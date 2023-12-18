import java.util.*;
import java.io.*;
import java.math.*;
class Main
{
    public static int f(int a,int b,int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for(int i=a-1;i<b;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        return list.size();
    }

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
        int[] a = new int[Q];
        int[] b = new int[Q];
        for(int qi=0;qi<Q;qi++)
        {
            a[qi] = sc.nextInt();
            b[qi] = sc.nextInt();
        }
        for(int qi=0;qi<Q;qi++)
        {
            System.out.println("\t"+f(a[qi],b[qi],arr));
        }

        
    }
}