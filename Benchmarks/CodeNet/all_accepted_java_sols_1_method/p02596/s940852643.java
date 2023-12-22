import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();

        long num = 7;
        if(k==7 || k==1) {
            System.out.println(1);
            return;
        }
        for(int i=2; i<k+2; i++) {
            num *= 10;
            num += 7;
            num %= k;
            if(num == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }


}