import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    s.close();
    
    int i = 1, j = 9;
    while (i <= j) {
      int p = i * j;
      if (p == x) {
        System.out.print("Yes");
      	return;
      }
      if (p < x) {
      	i++;
      } else {
      	j--;
      }
    }
    System.out.print("No");
    return;
  }
}