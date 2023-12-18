import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      String ans = "No";
      for(int i = 0; i <= X; i++){
        for(int j = 0; j <= X - i; j++){
          int leg = 2 * i + 4 * j;
          if(leg == Y) ans = "Yes";
        }
      }
      System.out.println(ans);
    } 
}