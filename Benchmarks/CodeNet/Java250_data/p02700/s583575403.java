import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		String s = bw.readLine();
		String[] w = s.split("\\s+");
		int healthA = Integer.parseInt(w[0]);
		int attackA = Integer.parseInt(w[1]);
		int healthB = Integer.parseInt(w[2]);
		int attackB = Integer.parseInt(w[3]); 
		
		int bitTimesA = healthA/attackB;
		bitTimesA+=(healthA%attackB)==0?0:1;
		int bitTimesB = healthB/attackA;
		bitTimesB+=(healthB%attackA)==0?0:1;
		
		if( bitTimesA >= bitTimesB) {
			System.out.println("Yes");
		}
		else if( bitTimesA < bitTimesB) {
			System.out.println("No");
		}
		
		bw.close();
	}
	 
	
}	

