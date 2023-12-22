import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
		String s = keyIn.readLine();
		String[] array = s.split("");
		int count = 0;
		if(array[0].equals("1")) count++;
		if(array[1].equals("1")) count++;
		if(array[2].equals("1")) count++;
		
		System.out.println(count);

	}

}