import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    
    int oddCount;
    if (n % 2 == 0) {
      oddCount = n / 2;
    } else {
      oddCount = n / 2 + 1;
    }
    
    double oddCountDouble = (double) oddCount;
    double answer = oddCountDouble / n;
    System.out.println(answer);
  }
}