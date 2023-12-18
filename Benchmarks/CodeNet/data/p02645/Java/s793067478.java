import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String nickName = sc.nextLine();
        int x = rand.nextInt(nickName.length() - 3);

        System.out.println(nickName.substring(x, x + 3));
    }
}