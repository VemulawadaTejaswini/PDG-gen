import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 半径の長さ
    double r = sc.nextLong();

    // 円周の長さ
    double result = 2 * r * 3.14;
    System.out.println(result);
  }
}