import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.next().split(",");
            int[] cards = new int[13];
            int max = 0;
            int max2 = 0;
            for (int i = 0; i < lines.length; i++) {
                int n = Integer.parseInt(lines[i]) - 1;
                cards[n]++;
                if (max < cards[n]) {
                    max = cards[n];
                } else if (max2 < cards[n]) {
                    max2 = cards[n];
                }
            }
            String a = "";
            if (max >= 4) {
                a = "four card";
            } else if (max == 3) {
                if (max2 == 2) {
                    a = "full house";
                } else {
                    a = "three card";
                }
            } else if (max == 2 && max2 == 2) {
                a = "two pair";
            } else if (max == 2) {
                a = "one pair";
            } else {
                a = "null";
                int count = 0;
                for (int i = 0; i < 14; i++) {
                    if (cards[i % 13] == 1) {
                        count++;
                        if (count == 5) {
                            a = "straight";
                            break;
                        }
                    } else {
                        count = 0;
                    }
                }
            }
            System.out.println(a);
        }
    }
}
