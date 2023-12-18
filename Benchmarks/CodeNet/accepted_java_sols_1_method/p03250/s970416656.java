import java.io.*;
import java.util.*;

public class Main { //Runnableを実装する
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] s = {a, b, c};
        Arrays.sort(s);
        System.out.println(s[2] * 10 + s[1] + s[0]);
    }

}
