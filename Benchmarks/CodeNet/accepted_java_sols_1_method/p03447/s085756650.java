import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        int a = Integer.valueOf(sc.nextLine());
        int b = Integer.valueOf(sc.nextLine());
        int result = (x - a) % b;
        System.out.println(result);   
        sc.close();
    }
}