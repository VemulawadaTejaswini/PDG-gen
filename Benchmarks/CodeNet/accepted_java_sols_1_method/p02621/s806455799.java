import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println((int)(num + Math.pow(num, 2) + Math.pow(num, 3)));
    }
}
