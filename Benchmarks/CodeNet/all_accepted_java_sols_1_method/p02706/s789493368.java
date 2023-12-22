import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int x = s.nextInt();
    for(int i = 0; i < x; i++){
      n = n - s.nextInt();
    }
    if(n < 0){
      System.out.println(-1);
    } else {
    System.out.println(n);
    }
  }
}