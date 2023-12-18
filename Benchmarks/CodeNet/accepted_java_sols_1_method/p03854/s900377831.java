import java.util.*;

class Main {
    static String divide[] = {
        "dream",
        "dreamer",
        "erase",
        "eraser"
    };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int index = S.length();
        boolean canDiv;
        while (true) {
            boolean isFit = false;
            for (String d: divide) {
                if (d.length() > index) continue;
                String substr = S.substring(index - d.length(), index);
                if (d.equals(substr)) {
                    index -= d.length();
                    isFit = true;
                    break;
                }
            }
            if (!isFit) {
                canDiv = false;
                break;
            }
            if (index == 0) {
                canDiv = true;
                break;
            }
        }

        if (canDiv)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
