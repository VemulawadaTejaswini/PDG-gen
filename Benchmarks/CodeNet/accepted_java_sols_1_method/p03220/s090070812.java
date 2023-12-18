import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double diff = 1000000;
        int candidate = -1;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            double temp = t - x * 0.006;
            double diffTemp =  Math.abs(a - temp);
            if(diffTemp < diff) {
                diff = diffTemp;
                candidate = i + 1;
            }
        }
        System.out.println(candidate);
    }
}
