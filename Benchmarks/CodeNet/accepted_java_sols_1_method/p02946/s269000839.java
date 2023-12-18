import java.util.*;
public class Main {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    int X = sc.nextInt();


    for(int i = 1;i<K+K;i++){
      System.out.print(X-(K-i));
      System.out.print(" ");
    }

  }
}