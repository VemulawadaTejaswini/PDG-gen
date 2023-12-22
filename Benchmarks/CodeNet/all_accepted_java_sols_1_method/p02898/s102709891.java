import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number_of_friends = input.nextInt();
        int required_height = input.nextInt();
        int allowed_people = 0;

        for (int i=0; i<number_of_friends; i++) {
            int height_of_each = input.nextInt();
            if (height_of_each >= required_height)
                allowed_people += 1;
        }

        System.out.println(allowed_people);

    }
}
