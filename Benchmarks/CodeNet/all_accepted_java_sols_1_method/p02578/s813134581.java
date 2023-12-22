import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] x = new int[N];
        for(int i=0; i<N; i++) {
          int A = sc.nextInt();
          x[i] = A;
        }
        long plus = 0;
        for(int i=1; i<N; i++) {
        if(x[i-1] > x[i]) {
          plus+=x[i-1]-x[i];
          //x[i]+=x[i-1]-x[i];
          x[i]=x[i-1];
        } else {
          continue;
        }
        }
      System.out.println(plus);
    }
  }