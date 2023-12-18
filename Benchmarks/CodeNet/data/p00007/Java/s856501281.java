import static java.lang.System.out;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().debt();
    }

    public void debt() {
        try (Scanner scan = new Scanner(System.in)) {
            debtHell(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void debt(String inputDataPath) {
        try (Scanner scan = new Scanner(new File(inputDataPath))) {
            debtHell(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void debtHell(Scanner scan) {
        double debt = 100000;
        int week = parseInt(scan.nextLine());
        for (int i = 0; i < week; i++)
            debt = rateCalc(debt);
        out.println((int) debt);
    }

    private double rateCalc(double debt) {
        debt *= 1.05;
        return (debt % 1000 > 0) ? debt + 1000 - debt % 1000 : debt;
    }
}