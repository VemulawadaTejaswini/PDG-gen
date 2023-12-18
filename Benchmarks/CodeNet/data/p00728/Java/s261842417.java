import java.util.Scanner; 
 
public class Main {
   public static void main(String[] args) {
     // ?¨??????\???????????????????????????????????????
     Scanner sc = new Scanner(System.in);
     while (true) {
       int n = sc.nextInt();
       if (n == 0) {
         break;
       }
       int[] scores = new int[n];
       for (int i = 0; i < n; i++) {
         scores[i] = sc.nextInt();
       }
       double average = 0;
       for(int i = 0; i < n; i++){
         average = average + score[i];
       }
       average = average/n;
       System.out.println(average);
     }
   }
} 