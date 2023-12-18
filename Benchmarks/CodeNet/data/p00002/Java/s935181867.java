import java.util.Scanner;

public class Main{
	static int digit(int a, int b){
		int x = a + b;
		int d = 0;
		while( x > 0 ){
			d++;
			x /= 10;
		}
		return d;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String[] str = new String[1000];
		int i = 0;
		for(; i < 1000; i++){
			str[i] = stdIn.nextLine();
			if( str[i].isEmpty() ){
				break;
			}
		}
		if( i == 1001 )
			i = 1000;
		String[][] s = new String[i][2];
		int[] a = new int[i];
		int[] b = new int[i];
		for(int j = 0; j < i; j++){
			s[j] = str[j].split(" ");
			a[j] = Integer.parseInt(s[j][0]);
			b[j] = Integer.parseInt(s[j][1]);
		}
		
		for(int j = 0; j < i; j++){
			System.out.println(digit(a[j],b[j]));
		}
	}
}