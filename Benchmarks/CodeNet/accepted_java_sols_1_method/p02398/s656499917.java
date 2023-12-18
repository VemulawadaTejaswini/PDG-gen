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
		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);
		int c = Integer.parseInt(tmpArray[2]);
//		int y = Integer.parseInt(tmpArray[3]);
//		int r = Integer.parseInt(tmpArray[4]);
		
		int count = 0;
		for(int i = a; i <= b ; i++){
			if(c % i == 0){
				count++;
			}
		}
		System.out.println(count);
		/*
		int i = 1;
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			if(a == 0 && b == 0){
				break;
			}
			if(a > b){
				int tmp = a; 
				a = b;
				b = tmp;
			}
			System.out.println(a + " "+b);
			
		}*/

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