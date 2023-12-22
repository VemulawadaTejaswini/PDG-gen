import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        int times = 0;
        while (H > 1) {
            times++;
            H >>= 1;
        }
        long result = 0;
        for (int i = 0; i<=times; ++i){
            result += Math.pow(2, i);
        }
        System.out.println(result);
    }
}
