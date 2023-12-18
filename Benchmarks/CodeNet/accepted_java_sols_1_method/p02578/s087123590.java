import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long size = sc.nextInt();
		long max = 0;
		long total = 0;

		for(long i=0; i<size; i++) {
			long sci = sc.nextInt();
			if(max < sci) max = sci;
			else if(max > sci) total += max - sci;
		}
		
		System.out.println(total);
	}
}
