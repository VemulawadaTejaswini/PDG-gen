import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[100000];

    for (int p = 1; p <= 100; p++){
      for(int q = 1; q <= 100; q++){
        for(int r = 1; r <= 100; r++){
          int s = p*p+q*q+r*r+p*q+q*r+r*p;
          if(s <= N){
            a[s]++;
          }
        }
      }
    }

    for(int i = 1; i <= N; i++){
      System.out.println(a[i]);
    }
    
  }
}
