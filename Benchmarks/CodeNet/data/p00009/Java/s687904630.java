import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		int count = 0;
		boolean check = true;

		for(int i = 2; i <= num; i++){
			for(int s = 2; s < i; s ++){
				if(s % i == 0){
					check = false;
				}
				if(check){
					count++;
				}
			}

		}



        System.out.println(count);

	}

}