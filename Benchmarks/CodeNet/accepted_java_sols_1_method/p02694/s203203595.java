import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = 100L;
        int b = 0;
        for (int i = 1; i < 1000000; i++) {
            a = (long)(a * 1.01);
            if(x <= a){
                b = i;
                break;
            }
        }
        System.out.println(b);
        sc.close();

    }

}
