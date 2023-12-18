import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] a;
        int num = 0, sum = 0, cnt = 0;
        double avg;
        while(sc.hasNext()) {
            a = sc.next().split(",");
            sum += Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
            num += Integer.parseInt(a[1]);
            cnt++;
        }
        avg = (double)num / cnt;
        
        System.out.println(sum);
        System.out.println(Math.round(avg));
    }
}