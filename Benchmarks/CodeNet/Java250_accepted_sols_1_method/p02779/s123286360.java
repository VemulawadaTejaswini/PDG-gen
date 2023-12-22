import java.util.Arrays;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int loop = input.nextInt();
		int  arr [] = new int [loop];
		int i=0;
		String x ="YES";
		while(i<loop) {
			arr[i]=input.nextInt();
			i++;
			
		}
		Arrays.sort(arr);
		i=0;
		while (i<loop-1) {
			if (arr[i] == arr[i+1]) {
				x="NO";
				break;
			
			}
			i++;
			
			
		}
		System.out.println(x);
		

	
}
}