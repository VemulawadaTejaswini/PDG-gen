import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int windowLength = sc.nextInt();
    int cartainLength = sc.nextInt();
    int len = windowLength - (cartainLength*2);

    if(len > 0)
        System.out.println(len);
    else
        System.out.println(0);
    }
}