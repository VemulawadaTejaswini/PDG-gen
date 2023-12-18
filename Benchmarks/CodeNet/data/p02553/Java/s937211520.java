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

        long result = a * c;
        result = result < a * d ? a * d : (result < b * c ? b * c : (result < b * d ? b * d : result));
        System.out.println(result);
    }
}
