import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer A = scan.nextInt();
        Integer B = scan.nextInt();
        int plus = A + B;
        int minus = A - B;
        int multi = A * B;
        int max = -999;
        if(max < plus)
            max = plus;
        if (max < minus)
            max = minus;
        if(max < multi)
            max = multi;
        System.out.println(max);
    }
}
