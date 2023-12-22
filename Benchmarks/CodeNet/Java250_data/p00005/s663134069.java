import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		try {
			while((line = br.readLine()) != null) {
				line = line.trim();
				String[] values = line.split("\\s");
				if(values.length != 2) System.exit(-1);
				
				int[] value = new int[2];
				int i = 0;
				for(String s : values) {
					value[i] = Integer.parseInt(s);
					if(value[i] > 2000000000 || value[i] < 0) System.exit(-2);
					i++;
				}
				int a = value[0];
				int b = value[1];

				int lcm = getLCM(a, b);
				
				System.out.println(getLCM(a, b) + " " + a * (b / lcm));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static int getLCM(int a, int b){
		int i = a;
		int j = b;
		while(i != j) {
			if(i > j) i -= j;
			else j -= i;
		}
		return i;
	}

}