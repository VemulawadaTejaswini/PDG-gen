import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int sum = Math.min(Math.min(scn.nextInt(), scn.nextInt()), scn.nextInt()) - 50;
            System.out.println(sum += Math.min(scn.nextInt(), scn.nextInt()));
        }
    }
}