import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;

class Main{
	public static void main(String[] a)throws ParseException , IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		Integer[] mountainHeight = new Integer[10];
	for (int i = 0 ; i <= 9 ; i++) {
mountainHeight[i] = Integer.valueOf(br.readLine());
	}
	Arrays.sort(mountainHeight , Collections.reverseOrder());
	
	for(int i = 0; i < 3 ; i++){
		System.out.println(mountainHeight[i]);
	}
	}
}