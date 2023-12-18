import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String  s = sc.next();
   int w = sc.nextInt();
   int k = w;
   char[] leader = s.toCharArray();
   System.out.print(leader[0]);
   while(true){
     if(w >= leader.length){
       break;
     }
     System.out.print(leader[w]);
     w = w + k;
   }
 }
}
