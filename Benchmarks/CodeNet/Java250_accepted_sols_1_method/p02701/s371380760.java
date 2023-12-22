import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
   String arr[] = new String[n];
   for(int i=0;i<n;i++)
   {
   		
   		arr[i]=br.readLine();
   }
   Arrays.sort(arr);
   int c=0;
   HashMap <String, Integer> map= new HashMap<>();
   for(int i=0;i<n;i++)
   {
   		if(!map.containsKey(arr[i])){
   			c++;
   			map.put(arr[i],1); 
   		}
   }
   System.out.println(c);
}
}