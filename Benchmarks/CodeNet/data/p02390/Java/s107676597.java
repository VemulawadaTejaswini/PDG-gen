import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h, m, s;

        h = n/3600;
        m = (n-h*36000)/60;
        s = n - (h*3600 + m*60);

        System.out.println(h+":"+m+":"+s);
    }
}