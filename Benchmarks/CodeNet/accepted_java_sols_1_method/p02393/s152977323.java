import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String [] str = bufferedReader.readLine().split(" ");
		Integer a = Integer.parseInt(str[0]);
		Integer b = Integer.parseInt(str[1]);
		Integer c = Integer.parseInt(str[2]);
		Integer tmp;
		
		Integer [] inlist = new Integer[str.length];
		
		for(int i = 0; i < str.length; i++){
			inlist[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(inlist);
	
		System.out.println(inlist[0] + " "+ inlist[1] + " " + inlist[2]);
		
	}
}