import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int A, B, numOfPalindromic = 0;
      Scanner sc = new Scanner(System.in);
      A = sc.nextInt(); B = sc.nextInt();

      for(; A<=B; A++) if ((A/10000 == A%10) && ((A/1000)%10 == (A/10)%10)) numOfPalindromic++;
      System.out.println(numOfPalindromic);
    }
}
