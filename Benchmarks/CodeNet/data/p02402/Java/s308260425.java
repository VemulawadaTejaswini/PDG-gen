import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		
		long[] numbers = new long[num];
		long min = -1000001;
		long max = 1000001;
		long sum = 0;
	    
		for(int i = 0; i < num; i++) {
			numbers[i] = stdin.nextLong();
	          if(max < numbers[i]) max = numbers[i];
	          if(min > numbers[i]) min = numbers[i];
	          sum = sum + numbers[i];
		}
	
		
		System.out.println(min + " "+ max + " " + sum);
		
		stdin.close();
	}

}