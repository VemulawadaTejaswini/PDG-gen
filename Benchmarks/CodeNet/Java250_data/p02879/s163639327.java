import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
      int B=sc.nextInt();
      if(1 <= A && A <= 9 && 1 <= B && B <= 9){
        System.out.println(A*B);
      }else{
        System.out.println(-1);
      }
    }
}