import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (line.equals("")) {
            line = scanner.nextLine();
        }
        String[] lines = line.split(" ");
        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            stringBuilder.append(N);
        }
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(stringBuilder.toString());
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder1.append(M);
        }
        treeSet.add(stringBuilder1.toString());
        System.out.println(treeSet.first());
    }

}