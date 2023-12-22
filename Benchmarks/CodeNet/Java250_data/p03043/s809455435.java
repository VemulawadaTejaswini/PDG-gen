import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int K = sc.nextInt();
     double p = 0, phold = 1.0;
     int point;
     for (int i =1;i<=N;i++){
       point = i;
       phold = 1.0/N;
       while(point<K){
         point *= 2;
         phold = phold/2.0;
       }
       p += phold;
     }
     System.out.println(p);
   }
}
