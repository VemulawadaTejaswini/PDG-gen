public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        int taro_point = 0, hanako_point = 0;
        String taro_card, hanako_card;
        for (int i = 0; i < n; i ++) {
            taro_card = sc.next();
            hanako_card = sc.next();
            if (taro_card.compareToIgnoreCase(hanako_card) > 0) { taro_point += 3; }
            if (taro_card.compareToIgnoreCase(hanako_card) == 0) { hanako_point ++; taro_point ++; }
            if (taro_card.compareToIgnoreCase(hanako_card) < 0) { hanako_point += 3; }
        }
        System.out.println(taro_point + " " + hanako_point);
    }
}