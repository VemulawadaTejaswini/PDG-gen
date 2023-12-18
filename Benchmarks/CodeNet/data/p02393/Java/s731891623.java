import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] str = x.split(" ");
		ArrayList <Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < str.length; i++){
			result.add(Integer.parseInt(str[i]));
		}
		Arrays.sort(str);
		System.out.println(str[0]+" "+str[1]+" "+str[2]);
	}
}