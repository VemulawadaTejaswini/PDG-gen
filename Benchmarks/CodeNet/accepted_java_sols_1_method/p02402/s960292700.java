import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ai = "";
		long goukei = 0;
		int max = 0, min = 0;
		br.readLine();
		ai = br.readLine();
		
		String [] hairetsu = ai.split(" ", 0);
		
		for(int i = 0; i < hairetsu.length; i++) {
			array.add(Integer.parseInt(hairetsu[i]));
		}
		
		min = array.get(0);
		max = array.get(0);
		
		for(int i = 0; i < array.size(); i++) {
			goukei = goukei + array.get(i);
			if(min > array.get(i)) {
				min = array.get(i);;
			}
			if(max < array.get(i)) {
				max = array.get(i);;
			}
		}
		
		System.out.println(min + " " + max + " " + goukei);
		

	}
}