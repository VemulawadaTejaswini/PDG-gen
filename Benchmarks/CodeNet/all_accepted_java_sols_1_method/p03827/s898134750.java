import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int x = 0;
		int max = 0;
		for(int i=0; i<n; i++){
			x = s.charAt(i) == 'I' ? x + 1 : x - 1;
			if(x > max){
				max = x;
			}
		}
		System.out.println(max);
	}
}
