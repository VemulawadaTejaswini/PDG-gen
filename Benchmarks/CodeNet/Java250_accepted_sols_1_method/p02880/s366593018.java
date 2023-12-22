import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int num =0;
    for(int i=1;i<=9;i++) {
      for(int j=1;j<=i;j++) {
        if(i*j==n) {
          num++;
        }
      }
    }
    if(num != 0 ) System.out.println("Yes");
    if(num == 0 ) System.out.println("No");
}
}
