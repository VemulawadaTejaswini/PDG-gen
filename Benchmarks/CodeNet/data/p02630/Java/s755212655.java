import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String ars[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n];
        HashMap<Integer,Integer> hmap=new HashMap<>();
        long sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
            sum=sum+arr[i];
        }
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++)
        {
            str=br.readLine().split(" ");
            int b=Integer.parseInt(str[0]);
            int c=Integer.parseInt(str[1]);
            if(hmap.containsKey(b))
            {
                int freq=hmap.get(b);
                sum+=freq*(c-b);
                hmap.remove(b);
                if(hmap.containsKey(c))
                hmap.put(c,hmap.get(c)+freq);
                else
                hmap.put(c,freq);
            }
            pw.println(sum);
        }
        pw.flush();
        pw.close();
    }
}