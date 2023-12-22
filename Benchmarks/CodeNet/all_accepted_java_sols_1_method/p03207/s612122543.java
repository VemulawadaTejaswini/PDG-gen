import java.util.*;
 
public class Main {
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int num = 0;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      int p = sc.nextInt();
      num = Math.max(num,p);
      sum += p;
    }
    System.out.println(sum-num/2);
  }
}  