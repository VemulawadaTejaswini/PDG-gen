import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
      int one = N % 10;
      String ans = "hon";
      if (one == 0 || one == 1 || one == 6 || one ==8) ans = "pon";
      if (one == 3) ans = "bon";
        System.out.println(ans);
    } 
}