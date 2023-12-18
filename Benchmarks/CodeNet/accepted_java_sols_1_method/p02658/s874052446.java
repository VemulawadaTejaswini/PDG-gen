import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long numbers[] = new long[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextLong();
            if(numbers[i] == 0){
                System.out.println(0);
                return;
            }
        }

        double ans = 0;
        for(int i = 0; i < n;i++){
            double d = Math.log10(numbers[i]);
            ans += d;
        }

        if(ans > 18){
            System.out.println(-1);
            return;
        }else{
            long answer = 1;
            for(int i = 0;i < n;i++){
                answer *= numbers[i];

                if(answer > (long)1e18){
                    System.out.println(-1);
                    return;
                }
            }

            System.out.println(answer);

        }

//        long ans = 1;
//        for(int i = 0;i < n;i++){
//            ans *= numbers[i];
//
//            if(ans > (long)1e18){
//                System.out.println(-1);
//                return;
//            }
//        }
//
//        System.out.println(ans);



//        NumberFormat nm = NumberFormat.getNumberInstance();
//        System.out.println(nm.format(l));


    }
}
