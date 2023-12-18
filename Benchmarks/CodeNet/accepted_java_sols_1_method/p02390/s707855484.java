import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();   // 58978979;
        int h = s / 3600;
        s -= h*3600;
        int m = s/60;
        s-= m*60;
        System.out.println(h+":"+m+":"+s);
    }
}

