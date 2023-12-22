import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(br.readLine());
//		int b = Integer.parseInt(tmpArray[1]);
//		int c = Integer.parseInt(tmpArray[2]);
//		int y = Integer.parseInt(tmpArray[3]);
//		int r = Integer.parseInt(tmpArray[4]);

		//HashMap<String, Boolean> cards = new HashMap<String, Boolean>();
		String[] mark = {"S","H","C","D"};
		boolean[][] exist = new boolean[4][13+1];
		for(int i = 0;i < 4; i++){
			Arrays.fill(exist[i], false);
		}

		//String[] tmpArray = br.readLine().split(" ");
		//int[] input = new int[n];
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			String tmpmark = tmpArray[0];
			int number = Integer.parseInt(tmpArray[1]);
			int markIndex;
			if(tmpmark.equals("S")){
				markIndex = 0;
			}
			else if(tmpmark.equals("H")){
				markIndex = 1;
			}
			else if(tmpmark.equals("C")){
				markIndex = 2;
			}
			else{
				markIndex = 3;
			}
			exist[markIndex][number] = true;
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 1; j <= 13; j++){
				if(!exist[i][j]){
					System.out.println(mark[i] + " " + j);
				}
			}
		}
//		
//		System.out.print(input[0]);
//		for(int i = 1 ; i < n; i++){
//			System.out.print(" "+ input[i]);
//		}
//		System.out.println();
////		
//		Arrays.sort(input);
//		System.out.printf("%d %d %d\n", input[0], input[input.length - 1], sum);
//		
//		while(true){
//			String[] tmpArray = br.readLine().split(" ");
//			int a = Integer.parseInt(tmpArray[0]);
//			int b = Integer.parseInt(tmpArray[1]);
//			if(a == 0 && b == 0){
//				break;
//			}
//			
//			for(int i = 0; i < a; i++){
//				for(int j = 0; j < b; j++){
//					if((i + j)%2 == 1){
//						System.out.print(".");
//					}
//					else{
//						System.out.print("#");
//					}
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

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