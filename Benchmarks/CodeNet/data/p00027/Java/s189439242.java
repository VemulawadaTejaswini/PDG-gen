package problem0027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Calendar;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            String[] values = line.split(" ");
            int month = Integer.parseInt(values[0]);
            int day = Integer.parseInt(values[1]);
            if (month == 0) {
                break;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(2004, month - 1, day);
            int dow = calendar.get(Calendar.DAY_OF_WEEK);
            out.println(monthNames[dow - 1]);
        }
    }

    static String[] monthNames = { "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday" };
}