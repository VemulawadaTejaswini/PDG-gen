import java.util.Scanner;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        int count  = 0;
        for (char c : input.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        System.out.println(count);
    }

}
