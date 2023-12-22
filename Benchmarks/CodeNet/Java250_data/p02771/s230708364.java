import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");

        int matches = 0;
        if (s[0].equals(s[1])) {
            matches++;
        }
        if (s[1].equals(s[2])) {
            matches++;
        }
        if(s[0].equals(s[2])) {
            matches++;
        }

        if(matches == 1) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
