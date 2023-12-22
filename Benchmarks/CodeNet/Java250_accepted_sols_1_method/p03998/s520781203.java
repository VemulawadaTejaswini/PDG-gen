import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] sa = s.next().split("");
        String[] sb = s.next().split("");
        String[] sc = s.next().split("");

        int idxA = 0;
        int idxB = 0;
        int idxC = 0;
        String turn = "a";
        while (true) {
            if ("a".equals(turn)) {
                if (idxA == sa.length) {
                    System.out.println("A");
                    return;
                }
                turn = sa[idxA];
                idxA++;
            } else if ("b".equals(turn)) {
                if (idxB == sb.length) {
                    System.out.println("B");
                    return;
                }
                turn = sb[idxB];
                idxB++;
            } else if ("c".equals(turn)) {
                if (idxC == sc.length) {
                    System.out.println("C");
                    return;
                }
                turn = sc[idxC];
                idxC++;
            }
        }
    }

}
