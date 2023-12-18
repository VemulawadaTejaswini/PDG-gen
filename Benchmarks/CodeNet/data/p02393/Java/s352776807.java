import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner momoko = new Scanner(System.in);
        int a = momoko.nextInt();
        int b = momoko.nextInt();
        int c = momoko.nextInt();
        int[] shuzu = {a, b, c};
        for (int i = 0; i < 3; i++) shuzu[i] = momoko.nextInt();
        Arrays.sort(shuzu);
        System.out.println(shuzu[0] + " " + shuzu[1] + " " + shuzu[3]);
    }
}
