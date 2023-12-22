
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] Array = line.split(" ");
        int A = Integer.parseInt(Array[0]);
        int B = Integer.parseInt(Array[1]);
        System.out.println(A*B+" "+2*(A+B));
    }
}