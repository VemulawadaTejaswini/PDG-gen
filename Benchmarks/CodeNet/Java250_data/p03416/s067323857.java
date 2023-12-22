import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int a, b, numOfPalindromic = 0;
          int[] digit = new int[5];
          Scanner sc = new Scanner(System.in);

          a = sc.nextInt(); b = sc.nextInt();

          for(; a<=b; a++){
          	for(int i=0; i<digit.length; i++)
          		digit[i] = (a/(int)Math.pow(10, i)) % 10; // digit[0] = １の位, digit[1] = 10の位 ・・・

          	if (digit[0] == digit[4] &&  digit[1] == digit[3])
          			numOfPalindromic++;
          }

          System.out.println(numOfPalindromic);

    }
}