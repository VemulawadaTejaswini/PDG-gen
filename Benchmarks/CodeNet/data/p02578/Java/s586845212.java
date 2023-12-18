import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int max = 0;
		int total = 0;

		for(int i=0; i<size; i++) {
			int sci = sc.nextInt();
			if(max < sci) max = sci;
			else if(max > sci) total += max - sci;
		}
		
		System.out.println(total);
	}
}
