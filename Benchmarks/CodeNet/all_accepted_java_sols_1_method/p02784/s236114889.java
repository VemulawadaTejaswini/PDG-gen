import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    long sum = 0;
    for(int i = 0; i < K; i++){
      sum += Long.parseLong(sc.next());
    }

    System.out.println(sum >= N ? "Yes" : "No");
  }
}