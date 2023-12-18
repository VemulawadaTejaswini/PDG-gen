import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int ans = (B - 1) / (A - 1);
    if((A - 1) * ans != B - 1){
      ans++;
    }
    System.out.println(ans);
  }
}
