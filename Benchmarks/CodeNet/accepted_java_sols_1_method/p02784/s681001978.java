import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int attack = 0;
        String[] skills = sc.nextLine().split(" ");
        for (String skill : skills) {
            attack += Integer.parseInt(skill);
        }

        System.out.println(h > attack ? "No" : "Yes");
    }
}