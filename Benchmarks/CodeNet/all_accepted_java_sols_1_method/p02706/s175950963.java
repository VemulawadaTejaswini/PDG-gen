import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int sum  = 0;
    for (int i = 0; i < M; i++) {
      sum = sum + Integer.parseInt(sc.next());
    }
    if(sum > N){
       System.out.print(-1);  
    }else{
       System.out.print(N - sum);
    }  
  }
}

