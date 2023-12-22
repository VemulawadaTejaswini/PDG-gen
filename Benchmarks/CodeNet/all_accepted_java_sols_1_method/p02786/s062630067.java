import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();

        long result = 0;

        long hnum = 1;
        while(h > 0){
            h = h / 2;
            result += hnum;
            hnum = hnum * 2;
        }

        System.out.println(result);
    }
}