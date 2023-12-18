import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t_life = sc.nextInt();
        int t_attack = sc.nextInt();
        int a_life = sc.nextInt();
        int a_attack = sc.nextInt();

        int ans1 = a_life % t_attack == 0 ? a_life / t_attack : (a_life / t_attack) + 1;
        int ans2 = t_life % a_attack == 0 ? t_life / a_attack : (t_life / a_attack) + 1;

        if (ans1 <= ans2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}