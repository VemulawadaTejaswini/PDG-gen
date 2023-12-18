
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split(" ");

		List<Integer> abc = new ArrayList<Integer>();
		abc.add(Integer.parseInt(get[0]));
		abc.add(Integer.parseInt(get[1]));
		abc.add(Integer.parseInt(get[2]));
		abc.sort(null);

		int a = abc.get(0); //small
		int b = abc.get(1);
		int c = abc.get(2);

		if(a%2 == b%2){
			System.out.println(((b-a)/2) +(c-b));
			System.exit(0);
		}else{
			a++;
			c++;	//count+1
			System.out.println(((b-a)/2) +(c-b) + 1);
			System.exit(0);
		}


	}
}