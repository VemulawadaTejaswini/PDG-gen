import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int taro = 0, hanako = 0;
        int i, j;
        char taroCard, hanakoCard;
        String[] cards;

        outside: for (i = 0; i < n; i++) {
            cards = br.readLine().split(" ");

            for (j = 0; j < cards[0].length() && j < cards[1].length(); j++) {
                taroCard = cards[0].charAt(j);
                hanakoCard = cards[1].charAt(j);
                if (taroCard > hanakoCard) {
                    taro += 3;
                    continue outside;
                } else if (taroCard < hanakoCard) {
                    hanako += 3;
                    continue outside;
                }
            }

            if (cards[0].length() > cards[1].length()) {
                taro += 3;
            } else if (cards[0].length() < cards[1].length()) {
                hanako += 3;
            } else {
                taro++;
                hanako++;
            }
        }

        System.out.println(taro + " " + hanako);
    }
}