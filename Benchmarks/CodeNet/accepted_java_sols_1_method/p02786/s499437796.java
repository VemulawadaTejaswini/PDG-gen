import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long hp = scanner.nextLong();
        scanner.close();

        long sumAttack = 0;
        long nextHp = hp;
        long numMon = 1;
        while(true) {
            if(nextHp != 1) {
                sumAttack += numMon;
                nextHp = nextHp / 2;
                numMon = numMon * 2;
            } else {
                sumAttack += numMon;
                break;
            }
        }

        System.out.println(sumAttack);
    }
}