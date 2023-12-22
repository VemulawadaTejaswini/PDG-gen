import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      String dmmy = scanner.nextLine();
      String d_all = scanner.nextLine();
      String[] d = d_all.split(" ");
      
      int r_int = 0;

      for (int i = 0;  i < n - 1 ; i ++ ) {
      for (int j = i+1;  j < n ; j ++ ) {
        r_int = r_int + (Integer.parseInt(d[i]) * Integer.parseInt(d[j]));
      }
      }
          System.out.println(r_int);

      return;
    }
  }
