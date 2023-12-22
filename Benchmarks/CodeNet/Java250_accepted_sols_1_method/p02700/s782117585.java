
import java.util.Scanner;

public class Main {

    /*
     * https://atcoder.jp/contests/abc164/tasks/abc164_a
     */

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        stdIn.close();

        String[] arguments = input.split(" ");
        int t_hp = Integer.valueOf(arguments[0]);
        int t_att = Integer.valueOf(arguments[1]);
        int a_hp = Integer.valueOf(arguments[2]);
        int a_att = Integer.valueOf(arguments[3]);

        String result = "Yes";

        while (true) {

            a_hp = a_hp - t_att;
            if (a_hp <= 0) {
                break;
            }

            t_hp = t_hp - a_att;
            if (t_hp <= 0) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }
}