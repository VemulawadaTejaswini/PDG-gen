import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long h = stdIn.nextLong();

        long monster = 1;
        long attack = 0;
        while (!(monster == 0)) {
            if (h / 2 == 0) {
                attack += monster;
                monster = 0;
            } else {
                h = h / 2;
                attack += monster;
                monster *= 2;
            }
        }
        System.out.println(attack);
    }
}
