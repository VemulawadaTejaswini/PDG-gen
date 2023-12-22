import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    char[] C = new char[N];
    char prev= S.charAt(0);
    int total = 0;
    int count =0;
    for (int i = 1; i < N; i++) {
      if(S.charAt(i) == prev){
        count++;
      }else{
        total += count;
        count=0;
      }
      prev = S.charAt(i);
    }

      total += count;


    System.out.println(Math.min(total+2*K, S.length()-1));

  }



}