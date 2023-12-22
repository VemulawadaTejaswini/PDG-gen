import java.util.*;


public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String[] data = sc.nextLine().split(" ");

    int a = Integer.parseInt(data[0]);
    int b = Integer.parseInt(data[1]);
    int c = Integer.parseInt(data[2]);

    if (a+b+c >= 22) {
        System.out.println("bust");
    }else{
        System.out.println("win");
    }
  }
}