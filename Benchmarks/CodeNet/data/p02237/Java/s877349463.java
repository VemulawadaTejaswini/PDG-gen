import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i ++ ){
			insertionSort(num, scanner);
		}
		
		scanner.close();
	}
	
	public static void output(int[] array, int num){
	   //出力
	   StringBuilder sb = new StringBuilder("");
	   sb.append(array[0]);
	   for (int i = 1; i < num; i++) {
		  sb.append(" ").append(array[i]);
	   }
		System.out.println(sb);
	}
	
	public static void insertionSort(int num,  Scanner scanner){
		int off = scanner.nextInt();		//いらないけど仕方ない
		int ope_num = scanner.nextInt();
		int[] array = new int[num];
		
		for(int i = 0; i < ope_num; i ++ ){
			array[scanner.nextInt() - 1] = 1;
		}
		output(array, num);
	}
}
