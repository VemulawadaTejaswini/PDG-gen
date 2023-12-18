import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
        int input = Integer.parseInt(br.readLine());
 
        int hour = input / 3600;
        int minutes = (input - hour * 3600) / 60;
        int seconds = input - (hour * 3600) - (minutes * 60);
 
        System.out.println(hour + ":" + minutes + ":" + seconds);
		
	}

}