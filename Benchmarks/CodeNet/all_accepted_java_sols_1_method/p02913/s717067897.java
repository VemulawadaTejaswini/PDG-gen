import java.util.*;

public class Main {
 public static void main(String... args) {
   Scanner scan = new Scanner(System.in);
   int N = scan.nextInt();
   String S = scan.next();
   
   int max = 0;
   int tmp = 0;
   String target = "";
   for(int i=0; i<N; i++) {
     for(int j=max; i+j<N; j++) {
       target = S.substring(i, i+j+1);       
       tmp = S.lastIndexOf(target);
       if(tmp != i && tmp > i+j) {
         max = j+1;
       } else {
         break;
       }
     }
   }
   System.out.println(max);
 }
}