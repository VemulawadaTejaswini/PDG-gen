import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.next().split(",");
            int[] cards = new int[13];
            int max = 0;
            int max2 = 0;
            for (String s:lines) {
                int n = Integer.parseInt(s) - 1;
                cards[n]++;
                if (max < cards[n]) {
                    max = cards[n];
                } else if (max2 < cards[n]) {
                    max2 = cards[n];
                }
            }
            String a=max>=4?"four card":max==3?max2==2?"full house":"three card":max==2?max2==2?"two pair":"one pair":"null";

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
               // }
            }
            System.out.println(a);
        }
    }
}
