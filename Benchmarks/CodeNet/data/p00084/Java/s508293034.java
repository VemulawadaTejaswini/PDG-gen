import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] array = input.split("[ .,]");
		
		for(int i = 0; i < array.length ; i++){
			if(array[i].length() >= 3 && array[i].length() <= 6){
				if(i != 0){
					System.out.print(" ");
				}
				System.out.print(array[i]);
			}
		}
		System.out.println();
	}

}