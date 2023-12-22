import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        double area = (double) w * (double) h / 2.0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;
        if(x - w / 2.0 == 0 && y - h / 2.0 == 0)
        	cnt++;
        System.out.println(area + " " + cnt);
    }
}
