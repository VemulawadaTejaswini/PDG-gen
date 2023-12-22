import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aStr = sc.next();
        String bStr = sc.next();
        String cStr = sc.next();

        String currentA = aStr;
        String currentB = bStr;
        String currentC = cStr;
        String ans = "";
        boolean finish = false;

        // 初回の処理
        String next = String.valueOf(aStr.charAt(0));
        currentA = aStr.substring(1);
        while (!finish) {

            switch (next) {
                case "a":
                    if (currentA.length() == 0) {
                        ans = "A";
                        finish = true;
                        break;
                    }
                    next = String.valueOf(currentA.charAt(0));
                    currentA = currentA.substring(1);
                    break;
                case "b":
                    if (currentB.length() == 0) {
                        ans = "B";
                        finish = true;
                        break;
                    }
                    next = String.valueOf(currentB.charAt(0));
                    currentB = currentB.substring(1);
                    break;
                case "c":
                    if (currentC.length() == 0) {
                        ans = "C";
                        finish = true;
                        break;
                    }
                    next = String.valueOf(currentC.charAt(0));
                    currentC = currentC.substring(1);
                    break;
            }

        }

        System.out.println(ans);
    }
}
