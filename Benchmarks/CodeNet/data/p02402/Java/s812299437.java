import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		String line = in.nextLine();
		String Array = line.split(" ");
		int min = Integer.parseInt(Array[0]);
		int max = Integer.parseInt(Array[0]);
		long sum = 0;
		for(int i = 1 ; i<number ; i++){
			int x = Integer.parseInt(Array[i]);
			if(x<min){
				min = x;
			}
			if(max<x){
				max = x;
			}
			sum += x;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}