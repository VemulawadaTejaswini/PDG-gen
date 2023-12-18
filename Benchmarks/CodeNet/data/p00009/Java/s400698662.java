import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String x = "";
		try {
			while ((x = in.readLine()) != null) {
				int nico = Integer.parseInt(x);
				
				boolean[] flag = new boolean[nico + 1];
				for (int i = 0; i < (nico + 1); i++) {
					flag[i] = true;
				}
				
				for (int i = 2; i * i < nico; i++) {
					for (int j = i * 2; j < nico; j = j + i) {
						if (flag[j] == false) continue;
						flag[j] = false;
					}
				}
				
				int count = 0;
				for (int i = 0; i < (nico + 1); i++) {
					if (flag[i]) count++;
				}
				System.out.println(count);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}