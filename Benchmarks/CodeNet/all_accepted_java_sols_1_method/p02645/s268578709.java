import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String nickName = sc.nextLine();

        try {
            if(nickName.length() < 3 || nickName.length() > 20)
                throw new Exception("文字数が不正です。");
            if(!nickName.matches("^[A-Za-z]+$"))
                throw new Exception("文字が不正です。");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        int x = rand.nextInt(nickName.length() - 2);

        System.out.println(nickName.substring(x, x + 3));
    }
}