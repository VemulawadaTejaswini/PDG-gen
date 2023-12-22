import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int K = in.nextInt();
      int A = K + K*K + K*K*K;
     
       
            System.out.println(A);
     
    }
}