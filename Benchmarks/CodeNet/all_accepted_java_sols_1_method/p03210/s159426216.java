import java.util.Scanner;
import java.util.Arrays;
public class Main { 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      	int X = reader.nextInt();
      if (X == 3 || X == 5 || X == 7) {
      	System.out.print("YES");
      } else {
      	System.out.print("NO");
      }	
    }
}