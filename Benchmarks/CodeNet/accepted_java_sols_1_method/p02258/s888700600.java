import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		int n=0;
		int minValue;
		int maxValue = -2000000000;
		try {
			n = Integer.parseInt(b.readLine());
			minValue = Integer.parseInt(b.readLine());;
			for(int i=1; i<n; i++) {
				int v = Integer.parseInt(b.readLine());
				if(maxValue < v-minValue) {
					maxValue = v-minValue;
				}
				if(v < minValue) {
					minValue = v;
				}			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(maxValue);
	}

}
