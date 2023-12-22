import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int p = x / 500 * 1000;
        x = x % 500;
        p += x / 5 * 5;
        System.out.println(p);
    }
}