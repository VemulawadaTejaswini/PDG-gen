import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().reverse();
    }

    public void reverse() {
        try (Scanner scan = new Scanner(System.in)) {
            reverseStr(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void reverse(String inputDataPath) {
        try (Scanner scan = new Scanner(new File(inputDataPath))) {
            reverseStr(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reverseStr(Scanner scan) {
        StringBuffer str = new StringBuffer(scan.nextLine());
        out.println(str.reverse());
    }
}