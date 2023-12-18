import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int hh = s / 3600;
        int mm = s % 3600 / 60;
        int ss = s % 60;
        System.out.format("%d:%d:%d\r\n", hh, mm, ss);
    }
}

