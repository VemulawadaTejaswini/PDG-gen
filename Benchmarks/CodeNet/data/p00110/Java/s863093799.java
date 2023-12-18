import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            check(sc.nextLine());
        }
    }

    private static void check(String s) {
        for (int i = 0; i <= 9; i++) {
              String[] lines = s.replaceAll("X", String.valueOf(i)).split("[+=]");
                if (Integer.parseInt(lines[0]) + Integer.parseInt(lines[1]) == Integer.parseInt(lines[2])) {
                    System.out.println(i);
                    return;
                }
        }
        System.out.println("NA");
    }
}

