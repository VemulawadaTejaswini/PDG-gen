import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner scanner = new Scanner(System.in);
    int main_1 = scanner.nextInt();
    int main_2 = scanner.nextInt();
    int main_3 = main_1 * main_2;
    if(main_3 % 2 == 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}