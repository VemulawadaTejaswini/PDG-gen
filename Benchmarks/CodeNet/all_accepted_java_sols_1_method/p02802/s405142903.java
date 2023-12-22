import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       HashMap<Integer,String> hm = new HashMap<>();
       int n  = sc.nextInt();
       int m = sc.nextInt();
      int pen[] = new int[n];
      int cor[] = new int[n];

       for(int i=0; i<m; i++){
           int  x = sc.nextInt();
           String s = sc.next();
           if(hm.containsKey(x)){
               String ver = hm.get(x);
               if(ver.equals("WA") && s.equals("WA"))
                     pen[x-1]++;
               else if(ver.equals("WA") && s.equals("AC")){
                   hm.put(x,"AC");cor[x-1]++;
               }
           }else{
               if(s.equals("AC"))
                   cor[x-1]++;
               if(s.equals("WA"))
                   pen[x-1]++;
               hm.put(x,s);
           }
       }
       for(int i=0; i<n; i++){
           if(cor[i]==0)
               pen[i]= 0;
           }
       int penalty=0,correct=0;
       for(int xx : pen)
           penalty += xx;
       for(int xx : cor)
           correct += xx;

       System.out.println(correct+" "+penalty);
    }
}