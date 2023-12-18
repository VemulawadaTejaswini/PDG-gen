
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		String top = num[0], bottom = num[1], center = num[2], back = num[3], right = num[4], left = num[5]; // ??????????????????
		char[] chars = br.readLine().toCharArray();
		String temp; 
		for (int i = 0; i < chars.length; i++) { //??¢????????????
			
			switch (chars[i]) {
				
			case 'S':
				
				temp = top;
				top = back;
				back = bottom;
				bottom = center;
				center = temp;
				break;
				
			case 'N':

				temp = top;
				top = center;
				center = bottom;
				bottom = back;
				back = temp;
				break;
				
			case 'E':
				
				temp = top;
				top = left;
				left = bottom;
				bottom = right;
				right = temp;
				break;

			case 'W':
				
				temp = top;
				top = right;
				right = bottom;
				bottom = left;
				left = top;
				break;
				
			}
		}
		System.out.println(top);
	}
}