import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int w = Integer.parseInt(tmpArray[0]);
		int h = Integer.parseInt(tmpArray[1]);
		int x = Integer.parseInt(tmpArray[2]);
		int y = Integer.parseInt(tmpArray[3]);
		int r = Integer.parseInt(tmpArray[4]);
		if(x >= r && w - x >= r && y >= r && h - y >= r){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
//		int[] array = new int[3];
//		array[0] = a; array[1] = b; array[2] = c;
//
//		Arrays.sort(array);
//		System.out.printf("%d %d %d\n", array[0], array[1], array[2]);
		/*
		if(a < b && b < c){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}*/
	}

}