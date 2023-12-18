import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] sCards = new boolean[13];
        boolean[] hCards = new boolean[13];
        boolean[] cCards = new boolean[13];
        boolean[] dCards = new boolean[13];
        StringBuilder sb = new StringBuilder();

        int restCardCnt = in.nextInt();
        while (in.hasNext()) {
            char suit = in.next().charAt(0);
            int number = in.nextInt();

            for (int i = 0; i < restCardCnt; i++) {
                switch (suit) {
                case 'S': sCards[number - 1] = true;    break;
                case 'H': hCards[number - 1] = true;    break;
                case 'C': cCards[number - 1] = true;    break;
                case 'D': dCards[number - 1] = true;    break;

                default:
                    break;
                }
            }
        }

        printRestCards("S", sCards, sb);
        printRestCards("H", hCards, sb);
        printRestCards("C", cCards, sb);
        printRestCards("D", dCards, sb);

        System.out.print(sb.toString());
    }

    private static void printRestCards(String suit, boolean[] rest, StringBuilder sb) {
        for (int i = 0; i < rest.length; i++) {
            sb.append(rest[i] ? "" : suit + " " + (i + 1) + "\n");
        }
        return;
    }
}