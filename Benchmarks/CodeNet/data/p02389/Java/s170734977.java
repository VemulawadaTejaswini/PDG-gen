import java.util.*;

public class Main {
    // Your code here!
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String a = "1 2";
        String line = scan.nextLine();
        String[] input = line.split(" ");
        int x = Integer.valueOf(input[0]);
        int y = Integer.valueOf(input[1]);
        int round = 2 * (x + y);
        int dense = x * y;
        System.out.println(String.valueOf(dense) + " " + String.valueOf(round));
    }
}

