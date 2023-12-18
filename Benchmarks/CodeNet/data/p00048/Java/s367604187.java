import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		int[] abo = {0,0,0,0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		double mon = 0;
		int syo=0,hisi=0;
		
		
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			
			if(tmp.equals("")){
				break;
			}
			
			mon = Double.parseDouble(tmp);
			System.out.println(mon);
			
			if(mon <= 48.0){
				System.out.println("light fly");
			}else if(mon > 48.0 && mon <= 51.0){
				System.out.println("fly");
			}else if(mon > 51.0 && mon <= 54.0){
				System.out.println("bantam");
			}
			else if(mon > 54.0 && mon <= 57.0){
				System.out.println("feather");
			}else if(mon > 57.0 && mon <= 60.0){
				System.out.println("light");
			}else if(mon > 60.0 && mon <= 64.0){
				System.out.println("light welter");
			}else if(mon > 64.0 && mon <= 69.0){
				System.out.println("welter");
			}else if(mon > 69.0 && mon <= 75.0){
				System.out.println("light middle");
			}else if(mon > 75.0 && mon <= 81.0){
				System.out.println("middle");
			}else if(mon > 81.0 && mon <= 91.0){
				System.out.println("light heavy");
			}else if(mon > 91.0){
				System.out.println("heavy");
			}
		}
	}

}