import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // xの範囲
        long a = sc.nextLong();
        long b = sc.nextLong();
        // yの範囲
        long c = sc.nextLong();
        long d = sc.nextLong();

        long resultA = a * c;
        resultA = resultA < a * d ? a * d : resultA;
        long resultB = b * c;
        resultB = resultB < b * d ? b * d : resultB;
        if (resultA < resultB) {
            System.out.println(resultB);
        } else {
            System.out.println(resultA);
        }
    }
}
