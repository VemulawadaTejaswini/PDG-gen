import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int max,min,sum = 0;
		int n = s.nextInt();
		int[] data = new int[n + 1];
		
		for(int i = 0;i < n + 1;i++){
			data[i] = s.nextInt();
		}
		
		max = data[0];
		min = data[0];
		for(int i = 0;i < n + 1;i++){
			if(data[i] >= max)
				max = data[i];
			if(data[i] <= min)
				min = data[i];
			sum += data[i];
		}
		
		System.out.println(min +" "+max+" "+sum);
		
	}
}