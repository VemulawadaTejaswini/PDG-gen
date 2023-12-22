import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int rest = N % 500;
    String result = A >= rest ? "Yes" : "No";
    System.out.println(result);
  }
}