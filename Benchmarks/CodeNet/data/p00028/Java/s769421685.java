import java.util.Scanner;

class Main{
	public static void main(String[] args){
		int [] array = new int[100];
		int max = 0;
		
		Scanner stdin = new Scanner(System.in);
		
		
		while (stdin.hasNext()){
			int n = stdin.nextInt();
			array[n]++;
		}
		
		for (int i = 0; i < 100; i++){
			if (max < array[i]){
				max = array[i];
			}
		}
		for (int i = 0; i < 100; i++){
			if (array[i] == max){
				System.out.println(i);
			}
		}
		
	}
}