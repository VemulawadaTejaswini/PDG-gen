import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] n_m_l = Stream.of(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[][] a = new int[n_m_l[0]][n_m_l[1]];
            int[][] b = new int[n_m_l[1]][n_m_l[2]];
            for (int i = 0; i < n_m_l[0]; i++) {
                int[] al = Stream.of(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                if (al.length != n_m_l[1]) {
                    System.out.println("Condition is invalid,");
                }
                a[i] = al;
            }
            for (int i = 0; i < n_m_l[1]; i++) {
                int[] bl = Stream.of(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                if (bl.length != n_m_l[2]) {
                    System.out.println("Condition is invalid,");
                }
                b[i] = bl;
            }
            int[][] c = new int[n_m_l[0]][n_m_l[2]];
            for (int i = 0; i < n_m_l[0]; i++) {
                for (int j = 0; j < n_m_l[2]; j++) {
                    for (int k = 0; k < n_m_l[1]; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
                System.out.println(IntStream.of(c[i])
                        .boxed()
                        .map(Object::toString)
                        .collect(Collectors.joining(" ")));
            }
        } catch (NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }
}

