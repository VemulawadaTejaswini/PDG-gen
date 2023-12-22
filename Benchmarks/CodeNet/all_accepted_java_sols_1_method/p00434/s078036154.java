import java.util.*;

public class Main {
    private static final int MAX = 30 + 1;

    public static void main(String[] args) {
        boolean[] students = new boolean[MAX];
        try(Scanner scn = new Scanner(System.in)) {
            while(scn.hasNextInt()) {
                students[scn.nextInt()] = true;
            }
        }
        for(int i = 1; i < MAX; i++) {
            if(!students[i]) {
                System.out.println(i);
            }
        }
    }
}