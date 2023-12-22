import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tHp = sc.nextInt();
        int tAtk = sc.nextInt();
        int aHP = sc.nextInt();
        int aAtk = sc.nextInt();
        boolean Tattack = true;

        while (tHp > 0 && aHP > 0) {
            if (Tattack) {
                aHP -= tAtk;
                Tattack = false;
            } else {
                tHp -= aAtk;
                Tattack = true;
            }
        }
        if (tHp > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}