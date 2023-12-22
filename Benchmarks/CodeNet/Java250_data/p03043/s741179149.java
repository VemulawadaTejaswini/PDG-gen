import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        double k = scan.nextInt();
        int a = 0;
        int c = 0;
        double out = 0;
        for(int i = 1; i <= n; i++){
            a = i;
            while(a < k){
                a *= 2;
                c++;
            }
            out += (1 / n) * Math.pow(0.5, c);
            c = 0;
        }
        System.out.println(out);
    }
}
