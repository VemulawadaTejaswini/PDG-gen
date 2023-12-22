//Swapping Two Numbers
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input;
		String[] xy;
		int x;
		int y;
		
		while (!(input = in.readLine()).equals("0 0")){
			
			xy = input.split(" ");
			x = Integer.parseInt(xy[0]);
			y = Integer.parseInt(xy[1]);
			
			if(x <= y ){
				System.out.println(x +" " +y);
			}else{
				System.out.println(y +" " +x);
			}
			
		}
	}
}