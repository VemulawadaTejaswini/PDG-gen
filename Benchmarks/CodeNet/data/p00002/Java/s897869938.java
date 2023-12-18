
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,x,count =0;
		int []result = new int[200];
		for(int i = 0;;i++){
			if(sc.hasNext() == false) break;
			a = sc.nextInt();
			b = sc.nextInt();
			x = a + b;
			for(int j = 1;;j++){
				if(x >= 10){
					x = x/10;
				} else {
					result[i] = j;
					count++;
					break;
				}
			}
		}
		for(int i = 0; i < count; i++){
			System.out.println(result[i]);
		}
	}
}