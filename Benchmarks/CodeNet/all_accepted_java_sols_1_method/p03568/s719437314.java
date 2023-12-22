import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int odd = 1;
    
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n%2 == 0){
        odd *= 2;
      }
    }
    int sum = (int)Math.pow(3,N);
    System.out.println(sum-odd);
  }
}