import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int n = scanner.nextInt();
            int ac = 0;
            int wa = 0;
            int tle = 0;
            int re = 0;

            for (int i = 0; i < n; i++) {
                switch (scanner.next()) {
                    case "AC":
                        ac++;
                        break;
                    case "WA":
                        wa++;
                        break;
                    case "TLE":
                        tle++;
                        break;
                    case "RE":
                        re++;
                        break;
                    default:
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AC x " + ac + "\n");
            sb.append("WA x " + wa + "\n");
            sb.append("TLE x " + tle + "\n");
            sb.append("RE x " + re + "\n");
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
