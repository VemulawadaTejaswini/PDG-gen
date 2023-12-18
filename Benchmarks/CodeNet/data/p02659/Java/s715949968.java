import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String[] bstr = sc.next().split("\\.");
        long b1 = Long.valueOf(bstr[0]) * 100;
        long b2 = Long.valueOf(bstr[1]);
        System.out.println(a * (b1 + b2) / 100);
    }

}
