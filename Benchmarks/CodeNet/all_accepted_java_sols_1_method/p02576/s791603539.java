import java.util.*;

public class  Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int n = s.nextInt(), x = s.nextInt(), t = s.nextInt();
        int count = 0;
        count = n / x * t;
        if (n % x > 0)
            count += t;

        System.out.println(count);
    }
}
