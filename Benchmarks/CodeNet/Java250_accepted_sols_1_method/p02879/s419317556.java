import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int M = sc.nextInt();
		//System.out.println(N+" "+M);
      if( (N >= 1 && N <= 9 ) &&
         (M >= 1 && M <= 9 ) )
      {
        System.out.println( N*M);
      }
      else{
        System.out.println("-1");
      }
    }


}
