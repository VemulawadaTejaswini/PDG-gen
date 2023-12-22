import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		while(true) {
			x.add(Integer.parseInt(br.readLine()));
			if(x.get(i) == 0) {
				break;
			}
			i++;
		}
		for(int j = 0; j < x.size() - 1; j++) {
			System.out.println("Case " + (j+1) + ": " + x.get(j));
		}
	}
}