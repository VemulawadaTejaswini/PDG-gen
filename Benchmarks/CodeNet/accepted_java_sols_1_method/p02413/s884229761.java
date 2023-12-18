import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int value;
		int rowTotal;
		int[] colTotal = new int[c];
		
		for (int i = 0; i < r; i++){
			rowTotal = 0;
			for (int j = 0; j < c; j++){
				value = sc.nextInt();
				System.out.print(value + " ");
				rowTotal += value;
				colTotal[j] += value;
			}
			System.out.println(rowTotal);
		}
		
		rowTotal = 0;
		for (int i = 0; i < c; i++){
			System.out.print(colTotal[i] + " ");
			rowTotal += colTotal[i];
		}
		System.out.println(rowTotal);
	}
}