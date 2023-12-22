import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        int answer = 0;
        char prev = '0';
        for (char chara : in.nextLine().toCharArray()) {
            if (chara != prev) {
                answer++;
                prev = chara;
            }
        }
        System.out.println(answer);
    }
}
