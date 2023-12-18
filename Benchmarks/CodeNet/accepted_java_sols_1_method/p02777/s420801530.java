import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String ball_color_s = line1.split(" ")[0];
        String ball_color_t = line1.split(" ")[1];

        String line2 = scanner.nextLine();
        String ball_num_s = line2.split(" ")[0];
        String ball_num_t = line2.split(" ")[1];

        String ball_collor_u = scanner.nextLine();

        Map<String, Integer> ball_map = new HashMap<>();
        ball_map.put(ball_color_s, Integer.valueOf(ball_num_s));
        ball_map.put(ball_color_t, Integer.valueOf(ball_num_t));
        ball_map.put(ball_collor_u, ball_map.get(ball_collor_u) - 1);

        System.out.println(ball_map.get(ball_color_s) + " " + ball_map.get(ball_color_t));
    }

}