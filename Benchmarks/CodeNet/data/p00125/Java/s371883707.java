import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int ｆｙ = sc.nextInt(), ｆｍ = sc.nextInt(), ｆｄ = sc.nextInt();
            int ｔｙ = sc.nextInt(), ｔｍ = sc.nextInt(), ｔｏ = sc.nextInt();
            if (ｆｙ == -1)
                break;
            System.out.println(Duration.between(LocalDateTime.of(ｆｙ, ｆｍ, ｆｄ,0,0), LocalDateTime.of(ｔｙ, ｔｍ, ｔｏ,0,0)).toDays());
        }
    }
}

