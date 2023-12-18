import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      for(int i = 0; i < n; i++){
         num[i] = sc.nextInt();
      }
      Arrays.sort(num);
      int alice = 0;
      for(int i = n - 1; i >= 0; i-=2){
         alice += num[i];
      }
      int bob = 0;
      for(int i = n - 2; i >= 0; i-=2){
         bob += num[i];
      }
      System.out.println(alice-bob);
   }
}