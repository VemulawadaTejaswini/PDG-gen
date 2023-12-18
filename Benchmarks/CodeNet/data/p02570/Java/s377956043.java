import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        double D = sc.nextInt();
        // スペース区切りの整数の入力
        double T = sc.nextInt();
        double S = sc.nextInt();

        double X;
        X = D/S;

      
      	if(X<=T){
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

    }
}
