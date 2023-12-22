import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] bells = new int[3];
        for (int i = 0; i < 3; i++) {
            bells[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(bells);
        System.out.println(bells[0] + bells[1]);
    }
}
