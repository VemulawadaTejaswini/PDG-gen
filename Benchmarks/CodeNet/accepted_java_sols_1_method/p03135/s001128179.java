import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String array[] = line.split(" ");
      double T = Integer.parseInt(array[0]);
      double X = Integer.parseInt(array[1]);
      double S;
      S = T / X;
      
      System.out.print(String.valueOf(S));
    }
}