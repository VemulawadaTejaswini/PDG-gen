import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder cards = new StringBuilder();
        int count;
        int i;
        int h;
        while (!cards.append(br.readLine()).toString().equals("-")) {
            count = Integer.parseInt(br.readLine());
            for (i = 0; i < count; i++) {
                h = Integer.parseInt(br.readLine());
                String subStr = cards.substring(0, h);
                cards.delete(0, h);
                cards.append(subStr);
            }
            System.out.println(cards);
            cards.delete(0, cards.length());
        }
    }
}