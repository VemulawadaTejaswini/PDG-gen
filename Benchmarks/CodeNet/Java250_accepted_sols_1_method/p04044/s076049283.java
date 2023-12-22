import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int N = sc.nextInt();
   int L = sc.nextInt();
   String[] sl = new String[N];
   for(int i =0;i<N;i++) sl[i] = sc.next();
   
   Arrays.sort(sl);
   StringBuilder sb = new StringBuilder();
   for(int i=0;i<N;i++) sb.append(sl[i]);
   System.out.println(sb.toString());
 }
}