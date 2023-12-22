import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		
		//n??¨m???????????\?????????int????????°???????´???????
		String s = scan.nextLine();
		String[] ary = s.split(" ");
		int n = Integer.parseInt(ary[0]);
		int m = Integer.parseInt(ary[1]);
		
		//n???????????±???????´???????
		ArrayList<String> array = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			array.add(scan.nextLine());
		}
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i = 0; i < m; i++) {
			data.add(scan.nextInt());
		}
		
		//int??????????????????2?¬?????????????????´???????
		int [][] intArray = new int[n][m];
		for(int i = 0; i < n; i++) {
			String str = array.get(i);
			String [] strAry = str.split(" ");
			for(int j = 0; j < strAry.length; j++) {
				intArray[i][j] = Integer.parseInt(strAry[j]);
			}
		}
		
		int[] sum = new int[n];
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				sum[i] = sum[i] + (intArray[i][j] * data.get(j));
			}
		}
				
		for(int i = 0; i < n; i++) {
			System.out.println(sum[i]);
		}
	}

}