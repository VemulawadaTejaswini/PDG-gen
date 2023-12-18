import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    boolean flag = false;
    for (int i=1; i<10; i++){
      if(N%i == 0 && N/i < 10){
        flag = true;
        break;
      }
    }

    if (flag)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}