import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();



        int ans = 1500;

        int tmp = ans;

        while (tmp>0){
            double tmpA = tmp*0.08;
            int A = (int)tmpA;
//            System.out.print(A);
            double tmpB = tmp*0.1;
            int B = (int)tmpB;
//            System.out.print(B);
            if (A==a && B==b){
                ans = tmp;
            }
            tmp--;
        }


//        System.out.print(ans);

        if (ans==1500){
            System.out.print(-1);
        }else {
            System.out.print(ans);
        }

    }
}

