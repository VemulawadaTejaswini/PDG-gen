import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		String check;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while((check=br.readLine()) != null) {
			String[] str = new String[12];
			str = check.split(",");
			int[] hen = new int[12];
			int zen = 0;
			for(int i=0; i<12; i++) {
				hen[i] = Integer.parseInt(str[i]);
				if(i<10) zen += hen[i];
			}
			double time = (double)zen / (double)(hen[10]+hen[11]);
			int sum = 0;
			for(int i=0; i<10; i++) {
				sum+=hen[i];
				if(time*hen[10] <= sum) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}