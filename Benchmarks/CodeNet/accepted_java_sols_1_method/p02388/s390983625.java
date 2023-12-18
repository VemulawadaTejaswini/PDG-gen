import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    //String s = System.console().readLine();
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    System.out.println(count * count * count);
  }
}
