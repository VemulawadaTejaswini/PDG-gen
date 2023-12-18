import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int diff = b - a;
        int sum = 0;

        for(int i = 0; i < diff; i++){
          sum = sum + i;
        }

        System.out.println(sum - a);
  }
}