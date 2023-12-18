import java.util.*;

class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int X = sc.nextInt();
   int place = 0;
   int cnt = 1;
   for(int i=0;i<N;i++){
     place += sc.nextInt();
     if (place<=X){
       cnt++;
     }
     
   }
   System.out.println(cnt);
 }
}
