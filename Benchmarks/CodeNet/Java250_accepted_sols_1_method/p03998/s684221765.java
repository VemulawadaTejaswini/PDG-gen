import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> cardsOfA = new ArrayList<>(Arrays.asList(br.readLine().split("")));
            List<String> cardsOfB = new ArrayList<>(Arrays.asList(br.readLine().split("")));
            List<String> cardsOfC = new ArrayList<>(Arrays.asList(br.readLine().split("")));

            String turn = "a";
            String winner = "";
            while (true) {
                if (turn.equals("a")) {
                    if (cardsOfA.size() == 0) {
                        winner = "A";
                        break;
                    }
                    turn = cardsOfA.get(0);
                    cardsOfA.remove(0);
                } else if (turn.equals("b")) {
                    if (cardsOfB.size() == 0) {
                        winner = "B";
                        break;
                    }
                    turn = cardsOfB.get(0);
                    cardsOfB.remove(0);
                } else if (turn.equals("c")) {
                    if (cardsOfC.size() == 0) {
                        winner = "C";
                        break;
                    }
                    turn = cardsOfC.get(0);
                    cardsOfC.remove(0);
                }
            }
            
            System.out.println(winner);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);  
        }
    }
}