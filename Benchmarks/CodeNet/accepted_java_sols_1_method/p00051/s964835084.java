import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int n = scan.nextInt();
		String number[] = new String[n];
		int max[] = new int[n];
		int min[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			number[i] = scan.next();
		}
		int order[] = new int[8];
		for(int i = 0 ; i < n ; i++){
			char text[] = number[i].toCharArray();
			for(int j = 0 ; j < 8 ; j++){
				order[j] = Character.getNumericValue(text[j]);
			}
			Arrays.sort(order);
			String maxText = String.valueOf(order[7]);
			for(int j= 6 ; j >= 0 ; j--){
				maxText = maxText + String.valueOf(order[j]);
			}
			String minText = String.valueOf(order[0]);
			for(int j = 1 ; j < 8 ; j++){
				minText = minText + String.valueOf(order[j]);
			}
			max[i] = Integer.parseInt(maxText);
			min[i] = Integer.parseInt(minText);
		}
		
		for(int i = 0 ; i < n ; i++){
			System.out.println(max[i]-min[i]);
		}
	}
}