import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pasta = Integer.MAX_VALUE;
		int drink = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++){
			int tmp = Integer.parseInt(br.readLine());
			if(tmp < pasta){
				pasta = tmp;
			}
		}
		
		for(int i = 0; i < 2; i++){
			int tmp = Integer.parseInt(br.readLine());
			if(tmp < drink){
				drink = tmp;
			}
		}
		
		System.out.println(pasta + drink - 50);
	}

}