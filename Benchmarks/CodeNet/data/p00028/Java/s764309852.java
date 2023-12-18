import java.util.Scanner;

class Main {
	public static void main(String[] args){
		int[] array = new int[200];
		int max;
		
		Scanner stdin = new Scanner(System.in);
		
		
		
		while (stdin.hasNext()){
			int num = stdin.nextInt();
			array[num]++;
		}
		
		max = 0;
		
		for (int i = 0; i < array.length; i++){
			if (max < array[i])max = array[i];
		}
		
		for (int i = 0; i < array.length; i++){
			if (max == array[i])System.out.println(i);
		}
		
	}
}