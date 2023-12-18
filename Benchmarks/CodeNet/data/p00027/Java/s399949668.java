import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] weeks = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
		int[] monthes = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		String str;

		try {
			while ((str = br.readLine()) != null) {
				String strArray[] = str.split(" ");
				if(Integer.parseInt(strArray[0]) == 0) break;
				int month = 0;
				for(int i = 1; i < Integer.parseInt(strArray[0]); i++ ) {
					month +=  monthes[i - 1];
				}
				int days = Integer.parseInt(strArray[1]);
				
				System.out.println(weeks[(days + month) % 7 ]);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}