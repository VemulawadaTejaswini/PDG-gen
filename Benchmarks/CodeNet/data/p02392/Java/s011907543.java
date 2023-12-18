import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] i = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt)
                                                .toArray();
        if (i[0] < i[1] && i[1] < i[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
