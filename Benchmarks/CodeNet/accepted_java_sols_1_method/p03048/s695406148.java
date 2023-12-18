import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int R = sc.nextInt();
      int G = sc.nextInt();
      int B = sc.nextInt();
      int N = sc.nextInt();
      
      int k = 0;
      int s = 0;
      for (int i = 0; i <= N / R; i++){
      	for (int j = 0; j <= N / G; j++){
          k = ( N - i*R - j*G ) / B;
          if (k >= 0 && i*R + j*G + k*B == N){
          	s += 1;
          }
        }
      }
      System.out.println(s);
    }
}
