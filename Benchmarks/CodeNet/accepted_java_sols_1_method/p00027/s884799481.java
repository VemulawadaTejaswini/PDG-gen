import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String[] dayOfWeek = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
	String line;
	String[] input;
	int month, day, numMonth, numDay;
	while ((line = br.readLine()) != null) {
	    input = line.split(" ");
	    month = Integer.parseInt(input[0]);
	    day = Integer.parseInt(input[1]);
	    if (month == 0 && day == 0) {
		break;
	    }
	    numMonth = month - 1;
	    numDay = day;
	    for (int i = 0; i < numMonth; i++) {
		numDay += days[i];
	    }
	    System.out.println(dayOfWeek[(numDay - 1) % 7]);
	}
    }
}