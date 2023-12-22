import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int asb = 0;
        int min = 1000;
        int sum2 = 0;
        int sum = 0;
        int nam[] = new int[N];

      for(int i = 0; i < N ;i++){
        nam[i] = sc.nextInt();
        sum += nam[i];
      }
      
       for(int i = 0; i < N-1;i++){
         sum -= nam[i];
         sum2 += nam[i];
         asb = Math.abs(sum-sum2);
         if(asb<min){min = asb;}
       }
      
      System.out.print(min);

    }
}