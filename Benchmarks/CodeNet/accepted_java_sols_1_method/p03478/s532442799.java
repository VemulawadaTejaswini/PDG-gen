import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer = 0;
    int sum = 0;
    
    for (int i=1; i<=n; i++) {
      int ns = i;
      int digSum = 0;
      while (ns > 0) {
        digSum += ns % 10;
        ns /= 10;
        }
      if (digSum >= a && digSum <= b)
        answer += i;
     }
    
  System.out.println(answer);
  }
}
