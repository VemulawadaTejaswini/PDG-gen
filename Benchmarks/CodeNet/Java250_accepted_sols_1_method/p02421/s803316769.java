import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taro_score = 0;
        int hanako_score = 0;
        String taro_card;
        String hanako_card;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            taro_card = scan.next();
            hanako_card = scan.next();
            if (taro_card.compareTo(hanako_card) > 0) {
                taro_score += 3;
            } else if (taro_card.compareTo(hanako_card) == 0) {
                taro_score += 1;
                hanako_score += 1;
            } else {
                hanako_score += 3;
            }
        }
        System.out.println(taro_score + " " + hanako_score);
    }
}