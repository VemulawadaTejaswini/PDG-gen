import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int Y = scanner.nextInt();

    if((Y-2*X)%2 != 0){
      System.out.println("No");
      scanner.close();
      return;
    }

    int kame = (Y-2*X) / 2;

    if(kame >= 0 && kame <= X){
      System.out.println("Yes");

    }else{
      System.out.println("No");
    }

    scanner.close();
    return;
    

  }
}