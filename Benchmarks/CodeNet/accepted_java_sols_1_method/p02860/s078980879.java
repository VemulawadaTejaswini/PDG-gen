import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        if(N % 2 != 0){
            System.out.println("No");
            return;
        }
        String T = S.substring(N/2);
        String S2 = T + T;
        if( S2.equals(S) ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}