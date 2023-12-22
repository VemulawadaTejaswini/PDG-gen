import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = Integer.parseInt(sc.next());
        int atk = Integer.parseInt(sc.next());
        int count = 0;
        while (hp > 0) {
            hp -= atk;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
