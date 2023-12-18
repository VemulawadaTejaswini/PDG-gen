import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer price = sc.nextInt();
        sc.close();
        int change = 0;
        for (int i = 1; ; i++) {
            if (i * 1000 - price >= 0) {
                change = i * 1000 - price;
                break;
            }
        }
        System.out.println(change);
    } 
}