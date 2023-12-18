import java.util.*;
import java.io.*;

class Main
{   
    public static void main(String[] args) throws IOException
    {
        Foster sc = new Foster();
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int N[] = sc.intArray(n);
        int M[] = sc.intArray(m);
        Stack<Integer> one = new Stack<>();
        Stack<Integer> two = new Stack<>();
        for(int i = n-1; i >= 0; i--)
        {
            one.push(N[i]);
        }
        for(int i = m-1; i >= 0; i--)
        {
            two.push(M[i]);
        }
        int count = 0;
        int topOne = 0, topTwo = 0;

        while(k > 0)
        {
            if(one.isEmpty() && two.isEmpty())
                break;

            if(one.isEmpty())
                topOne = Integer.MAX_VALUE; 
            else
                topOne = one.peek();   

            if(two.isEmpty())
                topTwo = Integer.MAX_VALUE;
            else
                topTwo = two.peek();
                
            if(topOne < topTwo && topOne != Integer.MAX_VALUE)
            {
                one.pop();
                if(k - topOne >= 0)
                {
                    k -= topOne;
                    count++;
                }
                else
                    break;
            }
            else if(topTwo <= topOne && topTwo != Integer.MAX_VALUE)
            {
                two.pop();
                if(k - topTwo >= 0)
                {
                    k -= topTwo;
                    count++;
                }
                else    
                    break;
            }
        }
        System.out.println(count);
    }

    static class Foster 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() 
        {
            while (!st.hasMoreTokens())
                try 
                {
                    st = new StringTokenizer(br.readLine());
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() 
        {
            return Integer.parseInt(next());
        }
        long nextLong() 
        {
            return Long.parseLong(next());
        }
        int[] intArray(int n)
        {
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = nextInt();
            }
            return arr;
        }
        long[] longArray(int n)
        {
            long arr[] = new long[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}