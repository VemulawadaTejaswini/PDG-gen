import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = IntStream.of(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::new).toArray();
        for (int i = 0; i < l.length; i++) {
            System.out.print(i != l.length - 1 ? l[i] + " " : l[i] + "\n");
        }

    }
}
