import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int AC = 0, WA = 0, TLE = 0, RE = 0;
        ArrayList<String> sn = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sn.add(scanner.next());
        }
        for (String s : sn) {
            switch (s) {
                case "AC":
                    AC = AC + 1;
                    break;
                case "WA":
                    WA = WA + 1;
                    break;
                case "TLE":
                    TLE = TLE + 1;
                    break;
                case "RE":
                    RE = RE + 1;
                    break;
            }
        }
        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);
    }
}