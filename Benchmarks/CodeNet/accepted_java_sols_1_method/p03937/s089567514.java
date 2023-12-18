import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] hw = str.split(" ");
		int h = Integer.parseInt(hw[0]);
		int w = Integer.parseInt(hw[1]);
		int count = 0;
		for(int i=0; i<h; i++){
			str = input.readLine();
			count += str.length()-str.replace("#", "").length();
		}

		if(h+w-1==count){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}


	}

}
