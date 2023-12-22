import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int hap = 0;
        int fives = n % 500;
        int num500 =n  / 500;
        int num5 =  fives / 5;
        hap += (num500 * 1000) + (num5 * 5);
        System.out.println(hap);
    }
}
