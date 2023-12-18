import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        make(scanner);
    }

    

    public static void make(Scanner cs) {
        int[] counting = new int[45];
        int n = cs.nextInt();
        counting[0] = counting[1] = 1;
        for (int i = 2; i <= n; ++i) {
            counting[i] = counting[i - 1] + counting[i - 2];
        }
        System.out.println(counting[n]);
    }

}
