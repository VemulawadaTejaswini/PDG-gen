import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.nextLine().split("[., ]");
            String s = "";
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].length() > 2 && lines[i].length() < 7) {
                    s += (i == 0 ? "" : " ") + lines[i];
                    //System.out.print((i == 0 ? "" : " ") + lines[i]);
                }
            }
            System.out.println(s);
        }
    }
}
