import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t_hp = Integer.parseInt(sc.next());
        int t_atk = Integer.parseInt(sc.next());
        int a_hp = Integer.parseInt(sc.next());
        int a_atk = Integer.parseInt(sc.next());
        boolean t_victory = false;
        while ((t_hp > 0) || (a_hp > 0)) {
            a_hp -= t_atk;
            if (a_hp <= 0) {
                t_victory = true;
                break;
            }
            t_hp -= a_atk;
            if (t_hp <= 0) {
                break;
            }
        }
        if (t_victory) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

}
