import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int AC =0;
        int WA =0;
        int TLE = 0;
        int RE = 0;
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "AC":
                    AC++;
                    break;
                case "WA":
                    WA++;
                    break;
                case "TLE":
                    TLE++;
                    break;
                case "RE":
                    RE++;
                    break;
            }
        }
        System.out.println(
                "AC x " + AC + System.lineSeparator() +
                        "WA x " + WA + System.lineSeparator() +
                        "TLE x " + TLE + System.lineSeparator() +
                        "RE x " + RE
        );
        }
    }
