import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int ncount = Integer.parseInt(reader.readLine()); // 一行目はテストケース数 Ｎ
            int cnt_AC = 0;
            int cnt_WA = 0;
            int cnt_TLE = 0;
            int cnt_RE = 0;
            String result;
            while (ncount != 0) {
                result = reader.readLine();
                ncount--;
                switch (result) {

                case "AC":
                    cnt_AC++;
                    break;

                case "WA":
                    cnt_WA++;
                    break;

                case "TLE":
                    cnt_TLE++;
                    break;

                case "RE":
                    cnt_RE++;
                }

            }
            reader.close();
            System.out.println("AC x " + cnt_AC);
            System.out.println("WA x " + cnt_WA);
            System.out.println("TLE x " + cnt_TLE);
            System.out.println("RE x " + cnt_RE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}