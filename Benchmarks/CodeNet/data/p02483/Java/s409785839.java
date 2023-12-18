import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] array = input.split(" ");
		int[] arrayAngka = new int[3];
		
		for(int i = 0; i < 3; i++){
			arrayAngka[i] = Integer.parseInt(array[i]);
		}	
		
		Arrays.sort(arrayAngka);
	
		for(int i = 0; i < arrayAngka.length; i++){	
			if(i != arrayAngka.length){
				System.out.print(arrayAngka[i] + " ");
			}
			else{
				System.out.println(arrayAngka[i]);
			}
		}
	}

}