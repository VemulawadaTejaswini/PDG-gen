import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] heights = new int[10];
		int index = 0;
		while(sc.hasNextInt() && index < 10){
	     heights[index++] = sc.nextInt();
		}
		printHeights(heights);
	}
	
	public static void printHeights(int[] mountains){
		int first =0 , second =0, third =0, current =0;
		for(int i = 0; i < mountains.length; i++){
			current = mountains[i];
			if(current >= first){
				third = second;
				second = third;
				first = current;
			}
			else if(current >= second){
				third = second;
				second = current;
			}
			else if(current >= third){
				third = current;
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}