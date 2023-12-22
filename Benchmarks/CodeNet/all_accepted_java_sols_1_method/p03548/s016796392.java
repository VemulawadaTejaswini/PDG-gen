import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();

      in.close();

      int ans = (x - z) / (y + z);

      System.out.println(ans);
    }
}
