import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(br.readLine());
		int i = 1;

		while(i < number){
				if(i % 3 == 0){
					System.out.print(" " + i);
				}

				if(i % 10 == 3){
					System.out.print(" " + i);
				}
				i++;
			}
	}

}