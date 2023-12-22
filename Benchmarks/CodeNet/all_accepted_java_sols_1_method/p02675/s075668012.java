import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = sc.next().split("");

        String x = list[list.length - 1];
        if (x.equals("3"))  System.out.println("bon");
        else if (x.equals("0") || x.equals("1") || x.equals("6") || x.equals("8")) System.out.println("pon");
        else System.out.println("hon");
    }
}