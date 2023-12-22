import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        
        int maxV = -1000000001;
        int minV = Integer.parseInt(sc.next());
        
        for(int i = 1; i < n; i++) {
            int rT = Integer.parseInt(sc.next());
            maxV = max(maxV, rT - minV);
            minV = min(minV, rT);
        }
        System.out.println(maxV);
    }

}
