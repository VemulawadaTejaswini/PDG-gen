
import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            
            
            int daysBeforeMonth[] = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
            String weekday[] = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};

            while ((line = br.readLine()) != null) {
	            String splitedLine[] = line.split(" ");
	            int daysInYear = daysBeforeMonth[Integer.valueOf(splitedLine[0])] + Integer.valueOf(splitedLine[1]);
	            
	            System.out.println(weekday[daysInYear % 7]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

