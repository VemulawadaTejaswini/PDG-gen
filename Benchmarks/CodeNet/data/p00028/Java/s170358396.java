import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int[] array = new int[150];
		Scanner input = new Scanner(System.in);
		int n;
		int max = 0;
		
		while(input.hasNext()){
			n = input.nextInt();
			
			array[n]++;
			
			if(max < array[n]) max = array[n];
		}
		
		for(int i = 0; i < array.length; i++){
			if (array[i] == max){
				System.out.println(i);
			}
		}
	}
}