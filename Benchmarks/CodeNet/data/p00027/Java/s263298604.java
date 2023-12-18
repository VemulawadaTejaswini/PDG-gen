import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[] weekday = {"Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"};
        try {

            while (true) {
                Calendar cal = Calendar.getInstance();
                String line = br.readLine();
                st = new StringTokenizer(line);
                int month = Integer.parseInt(st.nextToken());
                int date = Integer.parseInt(st.nextToken());
                if(month==0&&date==0){
                    break;
                }
                cal.set(2004,month-1,date);
                System.out.println(weekday[cal.get(Calendar.DAY_OF_WEEK)-1]);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}