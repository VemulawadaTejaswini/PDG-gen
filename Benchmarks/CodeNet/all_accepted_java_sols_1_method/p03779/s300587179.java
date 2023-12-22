import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long sum = 0, time = 0;
        for(int t = 1; ; t++) {
            sum += t;
            if(sum >= x) {
                time = t;
                break;
            }
        }
        System.out.println(time);
    }

}
