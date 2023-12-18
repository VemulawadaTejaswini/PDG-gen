import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            System.out.println(getDay(line));

       } catch (Exception e) {
            e.printStackTrace();
        }
    }

   private static String getDay(String line) {
        StringTokenizer st = new StringTokenizer(line, " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

       Calendar cal = Calendar.getInstance();
        cal.set(2004, x, y);

       String[] week_name = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

       int week = cal.get(Calendar.DAY_OF_WEEK);

       return week_name[week];
    }
}