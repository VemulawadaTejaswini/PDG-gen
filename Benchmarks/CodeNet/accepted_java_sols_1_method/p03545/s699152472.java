import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int a = Integer.valueOf(s);
		
		int []x = new int [4];
		
		for(int i = 0; i < 4  ; i++) {
			x[3-i] = a % 10;
			a = a / 10;
		}
		int []c = new int [3];
		
		for(int i = 0; i < 8 ; i++) {
			int temp = x[0];
			for(int j = 0; j < 3; j++) {
			if((1 & i >> j) == 1) {
				temp += x[j+1];
				c[j] = 1;
			}
			else {
				temp -= x[j+1];
				c[j] = 0;
			}
		}
			if(temp == 7) {
				break;
			}
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			if(c[i] == 1) {
			System.out.print(x[i] +""+"+");
			}
			else {
			System.out.print(x[i]+""+"-");
			}
		}
		System.out.print(x[3]+""+"=7");
	}

}
