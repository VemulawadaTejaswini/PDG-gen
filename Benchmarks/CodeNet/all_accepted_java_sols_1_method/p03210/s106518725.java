import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.next());
        if (age == 7 || age == 5 || age == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}