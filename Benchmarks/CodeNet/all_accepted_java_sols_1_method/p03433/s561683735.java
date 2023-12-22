import java.util.*;


public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        int one_yen_count = sc.nextInt();
        System.out.println(payment % 500 > one_yen_count ? "No" : "Yes");
    }
}