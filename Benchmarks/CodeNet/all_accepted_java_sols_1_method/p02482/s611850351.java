import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] array = input.split(" ");
		int[] arrayAngka = new int[2];
		
		for(int i = 0; i < 2; i++){
			arrayAngka[i] = Integer.parseInt(array[i]);
		}
		
		int a = arrayAngka[0];
		int b = arrayAngka[1];
		
		if(a < b) System.out.println("a < b");
		if(a > b) System.out.println("a > b");
		if(a == b) System.out.println("a == b");
		
		
	}
}