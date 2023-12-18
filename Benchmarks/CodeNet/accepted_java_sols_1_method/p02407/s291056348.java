import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		br.readLine();
		data = br.readLine();

		String [] hairetsu = data.split(" ", 0);
		
		for(int i = 0; i < hairetsu.length; i++) {
			array.add(Integer.parseInt(hairetsu[i]));
		}
		
		for(int i = 0; i < array.size(); i++) {
			array2.add(array.get(array.size() - 1 - i));
		}
		
		for(int i = 0; i < array2.size(); i++) {
			System.out.print(array2.get(i));
			if(i < array2.size() - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();

	}
}