import java.io.*;
import java.util.*;
import java.math.*;
public class Main
{
     public static void main(String[]args)throws IOException
     {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           String s = br.readLine();
           Map<Character,Integer> map = new HashMap<Character,Integer>();
            map.put('A',0);
            map.put('B',0);
           for(int i=0;i<3;i++)
           {
                char ch = s.charAt(i);
                if(ch=='A')
                {
                      int value=map.get('A');
                      value++;
                      map.put('A',value);
                }
                else
                {
                      int value=map.get('B');
                       value++;
                      map.put('B',value);
                }
           }
           if(map.get('A')==3 || map.get('B')==3)
           {
                System.out.println("No");
           }
           else
           {
                System.out.println("Yes");
           }
     }
}
             