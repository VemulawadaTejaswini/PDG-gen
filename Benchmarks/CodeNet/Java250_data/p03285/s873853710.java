import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        if(canBuy(dollar)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean canBuy(int dollar) {
        if(dollar == 0) return true;
        if(dollar < 0) return false;
        return canBuy(dollar - 4) || canBuy(dollar - 7) || canBuy(dollar - 11);
    }
}
