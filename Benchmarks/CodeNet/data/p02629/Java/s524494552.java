import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder();

        while(n != 0){
            long mod = n % 26;
            sb.insert(0, (char)(mod + 96));
            n /= 26;
        }

        System.out.println(sb);

    }
}
