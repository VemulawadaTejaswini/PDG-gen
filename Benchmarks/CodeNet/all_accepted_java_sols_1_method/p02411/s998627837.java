import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		while (true) {
			String[] buf = (br.readLine()).split(" ");
			int mid_exam = Integer.parseInt(buf[0]);
			int final_exam = Integer.parseInt(buf[1]);
			int retest = Integer.parseInt(buf[2]);
			char result;
			
			if (mid_exam == -1 && final_exam == -1 && retest == -1) {
				break;
			}
			
			if (mid_exam == -1 || final_exam == -1) {
				result = 'F';
			} else {
			
				if (mid_exam == -1) { mid_exam = 0; }
				if (final_exam == -1 ) { final_exam = 0; }
				int sum = mid_exam + final_exam;
				
				if (sum >= 80) { result = 'A'; }
				else if (sum >= 65) { result = 'B'; }
				else if (sum >= 50) { result = 'C'; }
				else if (sum >= 30) {
					if (retest >= 50) { result = 'C'; }
					else { result = 'D'; } }
				else { result = 'F'; }
			}
			
			System.out.println(result);
		}
	}
}