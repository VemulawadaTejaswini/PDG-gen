import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] times = new int[5];
		for(int i = 0; i < times.length; i++) 
			times[i] = sc.nextInt();
		
		int min = 0;
		for(int i = 1; i < times.length; i++) 
			if(mod(times[min]) > mod(times[i]))
				min = i;
		
		int sum = 0;
		for(int i =0; i < times.length; i++)
			if(i == min)
				sum += times[i];
			else
				sum += roundUp(times[i]);
		System.out.println(sum);
	}
	
	private static int roundUp(int i) {
		if(i % 10 == 0)
			return i;
		return (i / 10 + 1) * 10;
	}
	
	private static int mod(int i) {
		if(i % 10 == 0)
			return 10;
		else
			return i % 10;
	}
}