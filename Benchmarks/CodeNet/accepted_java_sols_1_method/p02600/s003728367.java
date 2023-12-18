import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 9;
        int ranges[][] = {
            {400, 599},
            {600, 799},
            {800, 999},
            {1000, 1199},
            {1200, 1399},
            {1400, 1599},
            {1600, 1799},
            {1800, 1999}
        };
        for(int range[] : ranges) {
            count--;
            if(range[0] <= n && n <= range[1]) {
                System.out.println(count);
            }
        }
    }
}