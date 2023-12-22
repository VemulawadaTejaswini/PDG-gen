import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> rooms =
            new ArrayList<ArrayList<ArrayList<Integer>>>();
        for (int b = 0; b < 4; b++) {
            rooms.add(b, new ArrayList<ArrayList<Integer>>());
            for (int f = 0; f < 3; f++) {
                rooms.get(b).add(f, new ArrayList<Integer>());
                for (int r = 0; r < 10; r++) {
                    rooms.get(b).get(f).add(0);
                }
            }
        }
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt() - 1;
            int f = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            int v = scanner.nextInt();
            rooms.get(b).get(f).set(r, rooms.get(b).get(f).get(r) + v);
        }

        for (int b = 0; b < 4; b++) {
            for (int f = 0; f < 3; f++) {
                for (int r = 0; r < 10; r++) {
                    System.out.print(" ");
                    System.out.print(rooms.get(b).get(f).get(r));
                }
                System.out.println("");
            }
            if (b != 3) {
                System.out.println("####################");
            }
        }
        scanner.close();
    }
}

