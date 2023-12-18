import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//?????±?????°n????¨??????????
		int n = (Integer.parseInt(br.readLine()));
		
		//n??¶????????±????????????
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}

		
		//?????????????????±???int??????????????????2?¬?????????????????´???????
		int[][] data = new int[n][4];
		for(int i = 0; i < n; i++) {
			String s = list.get(i);
			String [] ary = s.split(" ", 0);
		
			
			for(int j = 0; j < 4; j++) {	
				data[i][j] = Integer.parseInt(ary[j]);
			}
		}
		
		//?????±????????¨?????¨?±??????±????¨??????????
		int[][] building1 = new int[3][10];
		int[][] building2 = new int[3][10];
		int[][] building3 = new int[3][10];
		int[][] building4 = new int[3][10];
		for(int i = 0; i < n; i++) {
			int floor = data[i][1];
			int number = data[i][2];
			if(data[i][0] == 1) {
				building1[floor - 1][number -1] = building1[floor - 1][number -1] + data[i][3];
			}
			if(data[i][0] == 2) {
				building2[floor - 1][number -1] = building2[floor - 1][number -1] + data[i][3];
			}
			if(data[i][0] == 3) {
				building3[floor - 1][number -1] = building3[floor - 1][number -1] + data[i][3];
			}
			if(data[i][0] == 4) {
				building4[floor - 1][number -1] = building4[floor - 1][number -1] + data[i][3];
			}
		}
		
		//?????????????????????
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" " + building1[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" " + building2[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" " + building3[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" " + building4[i][j]);
			}
			System.out.println();
		}
	}

}