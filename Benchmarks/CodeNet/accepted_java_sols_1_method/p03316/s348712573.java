import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n_copy = n;
    int r = 0;

    while(n_copy > 0){
      r += n_copy % 10;
      n_copy /= 10;
    }

    if(n % r == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}
