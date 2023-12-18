import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static String[] heigth = new String[]
			{"1:",
			 "2:",
			 "3:",
			 "4:",
			 "5:",
			 "6:"};
	
	static BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		Main byakko = new Main();
		int n = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < n; i++){
			byakko.input();
		}
		for(int i = 0; i < 6; i++){
			System.out.println(heigth[i]);
		}
		reader.close();
	}
	
	public void input() throws IOException{
		double x = Double.parseDouble(reader.readLine());
		
		if(x < 165)heigth[0] += "*";
		else if(165 <= x && x < 170)heigth[1] += "*";
		else if(170 <= x && x < 175)heigth[2] += "*";
		else if(175 <= x && x < 180)heigth[3] += "*";
		else if(180 <= x && x < 185)heigth[4] += "*";
		else if(185 <= x)heigth[5] += "*";
	}
	
}