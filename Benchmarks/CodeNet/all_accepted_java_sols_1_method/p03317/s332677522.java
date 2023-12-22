import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = (a-1)/(b-1);
    int d = ((a-1)%(b-1)==0) ? 0 : 1;
    System.out.println((c+d));
  }
}
