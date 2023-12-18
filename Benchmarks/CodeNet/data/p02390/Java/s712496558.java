/**
 * Created by kyle on 2014/12/26.
 */
public class Main {

    private static final int HOUR = 60 * 60;
    private static final int MINUTE = 60;

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    protected static String calc(String input) {
        int remains = Integer.parseInt(input);

        int hours = remains / HOUR;
        remains = remains % HOUR;

        int minutes = remains / MINUTE;
        remains = remains % MINUTE;

        int secs = remains;

        return hours + ":" + minutes + ":" + secs;
    }

    private static String readLine() {
        java.util.Scanner s = null;
        try {
            s = new java.util.Scanner(System.in);
            return s.nextLine();
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}