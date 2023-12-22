import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      double []A = new double [N];
      double sum =0.0;
      
      //整数格納→1/整数→それを足す
      for(int i =0; i<N; i++){
      	A[i] = sc.nextInt();
        sum += 1.0/A[i];
      }
      //"１/逆数の和"を出力
      System.out.println(1.0/sum);
    }
}