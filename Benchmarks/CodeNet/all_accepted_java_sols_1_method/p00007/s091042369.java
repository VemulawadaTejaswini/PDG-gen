import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    int debt = 100000;
    double interest = 0.05;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      debt += debt * interest;
      debt = (int)Math.ceil((double)debt / 1000) * 1000;
    }   
    System.out.println(debt);
  }
}