import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = Integer.parseInt(sc.next());
        int sy = Integer.parseInt(sc.next());
        int tx = Integer.parseInt(sc.next());
        int ty = Integer.parseInt(sc.next());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Math.abs(ty - sy); i++) {
            ans.append("U");
        }
        for (int i = 0; i < Math.abs(tx - sx); i++) {
            ans.append("R");
        }
        for (int i = 0; i < Math.abs(ty - sy); i++) {
            ans.append("D");
        }
        for (int i = 0; i < Math.abs(tx - sx); i++) {
            ans.append("L");
        }
        ans.append("L");
        for (int i = 0; i < Math.abs(ty - sy) + 1; i++) {
            ans.append("U");
        }
        for (int i = 0; i < Math.abs(tx - sx) + 1; i++) {
            ans.append("R");
        }
        ans.append("D");
        ans.append("R");
        for (int i = 0; i < Math.abs(ty - sy) + 1; i++) {
            ans.append("D");
        }
        for (int i = 0; i < Math.abs(tx - sx) + 1; i++) {
            ans.append("L");
        }
        ans.append("U");
        System.out.println(ans.toString());
    }
}