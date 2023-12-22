import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int ans = 0;
        
        while(N>0) {
          ans += T;
          N=N-X;
        }

        System.out.println(ans);
    }
  }