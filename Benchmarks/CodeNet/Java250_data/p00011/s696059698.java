import static java.lang.System.out;
import static java.lang.Integer.parseInt;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().lots();
    }

    public void lots() {
        try (Scanner scan = new Scanner(System.in)) {
            draw(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    private void draw(Scanner scan) {
        int[] lots = getLots(parseInt(scan.nextLine()));
        int crossCount = parseInt(scan.nextLine());
        for (int chageCount = 0; chageCount < crossCount; chageCount++) {
            changeLot(scan.nextLine().split(","), lots);
        }
        for (int lot : lots) {
            out.println(lot);
        }
    }

    private int[] getLots(int count) {
        int[] lots = new int[count];
        for (int lotIndex = 0; lotIndex < count; lotIndex++) {
            lots[lotIndex] = lotIndex + 1;
        }
        return lots;
    }

    private void changeLot(String[] changeNumbers, int[] lots) {
        int beforeIndex = parseInt(changeNumbers[0]) - 1;
        int afterIndex = parseInt(changeNumbers[1]) - 1;
        int tmp = lots[beforeIndex];
        lots[beforeIndex] = lots[afterIndex];
        lots[afterIndex] = tmp;
    }
}