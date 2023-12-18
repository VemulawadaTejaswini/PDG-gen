import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        List<String> a = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            String str = sc.next();
            if (!str.matches("\\.+")) {
                a.add(str);
            }
        }
        int h = a.size();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < W; i++) {
            String str = "";
            for (int j = 0; j < h; j++) {
                str += String.valueOf(a.get(j).charAt(i));
            }
            if (!str.matches("\\.+")) {
                res.add(str);
            }
        }
        int w = res.size();
        List<String> restrue = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            String str = "";
            for (int j = 0; j < w; j++) {
                str += String.valueOf(res.get(j).charAt(i));
            }
            restrue.add(str);
        }
        for (String string : restrue) {
            System.out.println(string);
        }
        sc.close();
    }
}