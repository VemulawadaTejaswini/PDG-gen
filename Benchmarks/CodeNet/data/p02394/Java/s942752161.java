import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] i = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt)
                                                .toArray();
        if (i[2] - i[4] < 0 || i[0] < i[2] + i[4]) {
            System.out.println("No");
        } else if (i[3] - i[4] < 0 || i[1] < i[3] + i[4]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
