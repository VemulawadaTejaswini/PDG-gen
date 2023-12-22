import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int maxVari= 0;
        int last = 0 ;
        int lastval =0;
        for (int i = 0; i <5 ; i++) {
            int a  =sc.nextInt();
            int val = (int)Math.ceil( (double) a / 10) *10;
            if( val-a > maxVari){
                maxVari = val-a;
                last = a;
                lastval= val;
            }
            ans += val;
        }
        ans = ans -lastval +  last ;

            System.out.println(ans);
    }

}
