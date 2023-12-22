import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int j = in.nextInt();
    int res = Math.max(0, (4-i)*100000) + Math.max(0, (4-j)*100000);
    if(i == 1 && j == 1){
      res += 400000;
    }
    System.out.println(res);
    in.close();
  }
}
