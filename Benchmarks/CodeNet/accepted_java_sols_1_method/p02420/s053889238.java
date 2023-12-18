import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){

            while (true) {
                String deck = in.readLine();
                if (deck.equals("-")) break;

                int m = Integer.parseInt(in.readLine());
                for (int i = 0; i < m; i++) {
                    int h = Integer.parseInt(in.readLine());
                    deck = deck.substring(h) + deck.substring(0, h);
                }
                System.out.println(deck);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

