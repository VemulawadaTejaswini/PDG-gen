import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        double Ans = 0;
        int count = 0;
        double an = 0;
        double an1 = 0;
        double an2 = 0;
        for(int i =0 ; i < N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            Ans = Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
            if(Ans <= D){
                count++;
            }
        }
        sc.close();

        System.out.println(count);
        }
}
