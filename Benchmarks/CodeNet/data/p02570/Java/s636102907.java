import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int D = sc.nextInt();
        // スペース区切りの整数の入力
        int T = sc.nextInt();
        int S = sc.nextInt();

        int X;
        X = D/S;
        int Y;
        Y=D%S;
      
      	if(X<T){
        	System.out.println("Yes");
        } else if(X=T){
        	if(Y=0){
            	System.out.println("yes");
            } else {
            	System.out.println("No");
            }
        } else {
        	System.out.println("No");
        }

    }
}
