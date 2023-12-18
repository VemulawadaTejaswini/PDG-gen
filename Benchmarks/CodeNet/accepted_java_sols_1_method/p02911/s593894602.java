import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int point = scanner.nextInt();
      int ques = scanner.nextInt();
      int[] res = new int[num];
      Arrays.fill(res, point - ques);
      for (int i = 0; i < ques; i++) {
      	res[scanner.nextInt() - 1]++;
      }
      
      for (int i = 0; i < num; i++) {
        if (res[i] > 0) System.out.println("Yes");
        else System.out.println("No");
      }
      
    }
}
