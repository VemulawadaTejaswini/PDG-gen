import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hms = sc.nextInt();
        int h = hms / 3600;
        int m = hms % 3600 / 60;
        int s = hms % 60;
        System.out.println(h + ":" + m + ":" + s);
        sc.close();
    }
}
