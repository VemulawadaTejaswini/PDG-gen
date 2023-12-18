import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long k = sc.nextLong();
        Long d = sc.nextLong();

        while(k>0L) {
            if (Math.abs(0 - x) <= d) {
                if (d % 2 == 1) {
                    k = 1L;
                }else{
                    k = 0L;
                }
            }
            if(k==0)break;
            if(Math.abs(x+d)<Math.abs(x-d)){
                x += d;
            }else{
                x -= d;
            }
            k--;
//            System.out.println(Math.abs(x));
        }
        System.out.println(Math.abs(x));
    }
}