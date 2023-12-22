import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        sc.nextInt();
        sc.nextInt();
        sc.nextInt();
        int max = sc.nextInt();
        int k = sc.nextInt();
        if((max - min) > k) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}