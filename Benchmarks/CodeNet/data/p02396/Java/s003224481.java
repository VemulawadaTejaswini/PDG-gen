import static java.lang.System.out;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

class PrintTestCases {
    private StringBuilder msg;

    PrintTestCases(List<Integer> data) {
        // create a message
        this.msg = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == 0) break;
            this.msg.append(String.format("Case %d: %d\n", i+1, data.get(i)));
        }
        this.msg.trim();
    }

    @Override
    public String toString() {
        return msg.toString();
    }
}

public class Main {
    public static void main(String... args) {
        List<Integer> data = new LinkedList<>();

        // input
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            data.add(scan.nextInt());
        }

        // output
        out.println(new PrintTestCases(data));

        /*
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == 0) break; // 0???????????????
            out.printf("Case %d: %d\n", i+1, data.get(i) );
        }
        */
    }
}