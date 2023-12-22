import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      
      int K = sc.nextInt();
      String S = sc.next();

        if(K<S.length()){
        System.out.print(S.substring(0,K)+"...");
        }
        else if (K>=S.length()){
        System.out.print(S);
        }
      
    }
}
