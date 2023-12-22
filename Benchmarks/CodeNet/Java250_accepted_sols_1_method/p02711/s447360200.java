import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int hundreds = N / 100;
      int tens = (N / 10) % 10; // (n % 100) / 10
      int ones = N % 10;
       if ((hundreds == 7) || (tens == 7) || (ones == 7))
            System.out.println("Yes");
       else
            System.out.println("No");
        
  
    }
}