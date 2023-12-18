import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int min = b;
		int max = b;
		long  sum = 0;
		for(int i = 0 ;i<a ;i++){
			int c = in.nextInt();
			if(c<min){
				c = min;
			}
			if(c>max){
				c = max;
			}
			sum += c;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}