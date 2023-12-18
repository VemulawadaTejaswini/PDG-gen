
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n    = Integer.parseInt(scanner.nextLine());
		char[] t = scanner.nextLine().toCharArray();
		int ans = 0;
		int rcn = 0;
		int wcn = 0;

		for(int i = 0; i < n; i++) {

			if(t[i] == 'R'){

				rcn++;
			}
		}

		for(int i = 0; i < rcn; i++) {

			if(t[i] == 'W') {

				wcn++;
			}
		}



		System.out.println(wcn);
	}

}
