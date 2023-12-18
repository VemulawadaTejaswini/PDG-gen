

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int price = 100000;
		for (int i = 0; i < n; i++) {
			price *= 1.05;
			if (price % 1000 > 0) {
				price += 1000 - (price % 1000);
			}
		}
		
		System.out.println(price);
	}

}