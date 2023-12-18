
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();

        int[] time ={P+Q,P+R,Q+R};

        Arrays.sort(time);

        System.out.println(time[0]);


    }
}