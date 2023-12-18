import java.text.ParseException;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] l = new int[3];
            for (int i = 0; i < 3; i++) {
                l[i] = sc.nextInt();
            }
            String d = " " + l[1] + " " + l[2];
            if (l[0] >= 1869 && l[0] <= 1872 || l[0] == 1868 && (l[1] >= 10 || l[1] == 9 && l[2] >= 8)) {
                System.out.println("meiji" + d);
                continue;
            }
            try {
                JapaneseDate jd = JapaneseDate.of(l[0], l[1], l[2]);
                if (jd.getEra() == JapaneseEra.HEISEI) {
                    System.out.println("heisei" + d);
                } else if (jd.getEra() == JapaneseEra.SHOWA) {
                    System.out.println("showa" + d);
                } else if (jd.getEra() == JapaneseEra.TAISHO) {
                    System.out.println("taisho" + d);
                } else if (jd.getEra() == JapaneseEra.MEIJI) {
                    System.out.println("meiji" + d);
                }
            } catch (Exception e) {
                System.out.println("pre-meiji");
            }
        }
    }
}
