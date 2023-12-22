import java.util.Scanner;
 class Main{
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int N = scanner.nextInt();
     int K = scanner.nextInt();
     int X = 0;
     int[] numbers = new int[N];
     
     for(int i=0;i<N;i++) {
      numbers[i] = scanner.nextInt();
       if(numbers[i]>=K) {
         X++;
       }
     }
     System.out.println(X);
   }
 }