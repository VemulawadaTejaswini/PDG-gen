import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    for(int c = 1 ; c <= 3 ; c++) {
      int sumAll = a * b * c;
      
      if(sumAll % 2 == 1) {
        System.out.print("Yes");
        return;
      }
    }
    sc.close();
    System.out.print("No");
  }
}
