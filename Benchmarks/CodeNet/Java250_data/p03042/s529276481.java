import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            input.add(s);
        }
        sc.close();

        String output = "";

        String f = input.get(0).substring(0, 2);
        String b = input.get(0).substring(2);

        if (ym(f).equals(ym(b)) && ym(f).equals("MM")) {
            output = "AMBIGUOUS";
        } else if (ym(f).equals(ym(b)) && ym(f).equals("YY")) {
            output = "NA";
        } else if (ym(f).equals("MM")) {
            output = "MMYY";
        } else if (ym(f).equals("YY")) {
            output = "YYMM";
        }

        System.out.println(output);
    }

    private static String ym(String str) {
        String s;
        int a = Integer.parseInt(str);
        if (a >= 1 && a <= 12) {
            s = "MM";
        } else {
            s = "YY";
        }
        return s;
    }
}
