import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static int maxSize = 1000000;
    public static boolean[] prime = new boolean[maxSize];

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        setPrime();
        String inData = "";
        while (scan.hasNextLine() && !"".equals(inData = scan.nextLine())) {
            out.println(primeCount(parseInt(inData)));
        }
    }

    private void setPrime() {
        prime[2] = true;
        for (int i = 3; i < maxSize; i++) {
            if (i % 2 == 0) {
                continue;
            }
            setOddPrime(i);
        }
    }

    private void setOddPrime(int i) {
        boolean isPrime = true;
        for (int j = 1; j <= Math.sqrt(i); j++) {
            if (prime[j] && i % j == 0) {
                isPrime = false;
                break;
            }
        }
        prime[i] = (isPrime) ? true : false;
    }

    private int primeCount(int inData) {
        int count = 0;
        for (int i = 2; i <= inData; i++) {
            if (i != 2 && i % 2 == 0) {
                continue;
            }
            count = (prime[i]) ? ++count : count;
        }
        return count;
    }
}

abstract class BaseExe {

    public void exeSysIn() {
        try (Scanner scan = new Scanner(System.in)) {
            execute(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exeFileIn(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            execute(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract void execute(Scanner scan);
}