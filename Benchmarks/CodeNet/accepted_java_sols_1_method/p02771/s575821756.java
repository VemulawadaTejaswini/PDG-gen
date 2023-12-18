import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        boolean isKawaisou = false;
        if(A == B && B!= C) {
            isKawaisou = true;
        }
        if(B == C && C!= A) {
            isKawaisou = true;
        }
        if(C == A && A!= B) {
            isKawaisou = true;
        }
        
        System.out.println(isKawaisou? "Yes" : "No");
    }


}
