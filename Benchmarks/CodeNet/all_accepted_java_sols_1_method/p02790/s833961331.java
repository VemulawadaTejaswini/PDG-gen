import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        String ans = "";

        if(A < B){
            for (int i = 0; i < B; i++) {
                ans += String.valueOf(A);
            }
        }else{
            for (int i = 0; i < A; i++) {
                ans += String.valueOf(B);
            }
        }


        System.out.println(ans);

    }
}

