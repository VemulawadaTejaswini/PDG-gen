import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] str = input.split(" ");
		ArrayList <Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < str.length; i++){
			result.add(Integer.parseInt(str[i]));
		}
		
		int W = Integer.parseInt(str[0]);
		int H = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);
		int r = Integer.parseInt(str[4]);
		
		if( x+r<=W && x-r>=0 && y+r<=H && y-r>=0 ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}