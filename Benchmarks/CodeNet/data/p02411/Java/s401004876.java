import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    private static final int ABSENT = -1;

    protected static String process(String data) {
        StringBuilder sb = new StringBuilder();
        final String[] lines = splitForLines(data);

        for (String line : lines) {
            final int[] split = split(line);

            final int midScore = split[0];
            final int finalScore = split[1];
            final int retestScore = split[2];

            if (midScore == ABSENT && finalScore == ABSENT && retestScore == ABSENT) {
                break;
            }

            sb.append(calcGrade(midScore, finalScore, retestScore)).append('\n');
        }

        return sb.toString();
    }

    static Grade calcGrade(int midScore, int finalScore, int retestScore) {
        if (midScore == ABSENT || finalScore == ABSENT) {
            return Grade.F;
        }

        final int baseScore = midScore + finalScore;

        if (baseScore >= 80) {
            return Grade.A;
        }

        if (baseScore >= 65) {
            return Grade.B;
        }

        if (baseScore >= 50) {
            return Grade.C;
        }

        if (baseScore >= 30) {
            if (retestScore >= 50) {
                return Grade.C;
            }
            return Grade.D;
        }

        return Grade.F;
    }

    enum Grade {
        A, B, C, D, F
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
    }

    public static void main(String[] args) {
        System.out.print(process(readAll(System.in)));
    }
}