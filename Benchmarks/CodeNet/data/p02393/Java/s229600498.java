import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] list = new int[3];
        list[0] = num.nextInt();
        list[1] = num.nextInt();
        list[2] = num.nextInt();
        num.close();
        Arrays.sort(list);

        System.out.printf("%d %d %d\n", list[0], list[1], list[2]);
    }
}
