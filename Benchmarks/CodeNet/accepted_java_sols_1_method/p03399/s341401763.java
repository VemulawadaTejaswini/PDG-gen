import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      int m = 0;
      int n = 0;
      if(A>=B){
        m = B;
      }else{
        m = A;
      }
      if(C>=D){
        n = D;
      }else{
        n = C;
      }
      System.out.println(m+n);
    }
}
      