import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] list = {a, b, c};
            Arrays.sort(list);
            System.out.println(list[2] - list[0]);
            }
}