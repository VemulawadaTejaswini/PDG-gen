import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vvhatourist = sc.nextInt();
    int sub = vvhatourist/15;
    System.out.println(vvhatourist*800-sub*200);
  }
}
