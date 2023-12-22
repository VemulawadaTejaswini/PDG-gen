import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer[] mochiArr = new Integer[num];

        for (int i = 0; i < num; i++) {
            mochiArr[i] = sc.nextInt();
        }

        Arrays.sort(mochiArr, Collections.reverseOrder());
        int count = 1;
        for (int i = 0; i < mochiArr.length - 1; i++) {
            if (mochiArr[i] == mochiArr[i + 1]) continue;
            if (mochiArr[i] > mochiArr[i + 1]) count++;
        }

        System.out.println(count);
    }
}
