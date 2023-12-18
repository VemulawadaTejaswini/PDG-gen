
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		String top = num[0], center = num[1], right = num[2], left = num[3], back = num[4], bottom = num[5]; // ??????????????????
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
				
			default:
					break;
			}
		}
		System.out.println(top);
	}
}