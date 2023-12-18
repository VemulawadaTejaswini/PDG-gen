import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        int sum = 0;
        while (true) {
            String a = sc.nextLine();
            if (a.equals("END_OF_TEXT")) {
                break;
            }
            for (String s : a.split(" ")) {
                if (s.equalsIgnoreCase(d)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
}

