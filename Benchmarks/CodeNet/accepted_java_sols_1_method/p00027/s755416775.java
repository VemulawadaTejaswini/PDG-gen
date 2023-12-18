import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int month, day;
        try {
            while (true) {
                String[] input = br.readLine().split(" ");
                month = Integer.parseInt(input[0]);
                day = Integer.parseInt(input[1]);
                if (month < 1) break;
                for (; month > 1; month--) {
                    day += 31;
                    switch(month) {
                        case 3:
                            day--;
                        case 5:
                        case 7:
                        case 10:
                        case 12:
                            day--;
                        break;
                    }
                }
                String[] weekday = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
                System.out.println(weekday[day%7]);
            }
        } finally {
            br.close();
        }
    }
}