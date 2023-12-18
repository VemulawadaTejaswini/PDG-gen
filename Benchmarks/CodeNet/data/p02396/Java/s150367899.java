import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 1;

		do {
			String num = br.readLine();

			if(Integer.parseInt(num) == 0){
				break;

			}else {
				System.out.println("Case"+" "+i+":"+" "+num);
				i++;
			}



		} while (i !=0);




	}

}