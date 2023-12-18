import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.valueOf(line.split(" ")[0]);
		int q = Integer.valueOf(line.split(" ")[1]);
		
		int[] array = new int[n];
		Arrays.fill(array, 0);
		for(int i = 0; i < q; i++){
			String query = sc.nextLine();
			int command = Integer.valueOf(query.split(" ")[0]);
			int x = Integer.valueOf(query.split(" ")[1]);
			int y = Integer.valueOf(query.split(" ")[2]);
			switch(command){
				case 0:
					add(array, x, y);
					break;
				case 1:
					System.out.println(sum(array, x, y));
					break;
			}
		}
		sc.close();
	}
	
	static void add(int[] array, int index, int x){
		array[index-1] += x;
	}
	
	static int sum(int[] array, int from, int to){
		int result = 0;
		for(int i = from-1; i <= to-1; i++){
			result += array[i];
		}
		return result;
	}
}