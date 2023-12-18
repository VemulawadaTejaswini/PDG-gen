import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = scanner.nextInt();
        int attack = scanner.nextInt();

        int answer = health / attack;
        int nokori = health % attack;
        if(nokori > 0) {
            answer ++;
        }
        System.out.println(answer);
    }
}
