import java.util.Scanner;

/**
 * Created by ui on 2016/02/03.
 */
public class XCubic {

    public static void run () {
        int xc = readInput();
        printCubic(xc);
    }
    public int readInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void printCubic (int x){
        System.out.println(x*x*x);
    }
}
public class Main {
    public static void main(String[] args) {
        XCubic.run();
    }
}