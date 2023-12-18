import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int m, f, r, n = 0;
		String data[] = new String[50];
		
		while(true) {
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			
			if( m == -1 && f == -1 && r == -1)break;
			
			if( m == -1 || f == -1) {
				data[n] = "F";
			}else if( m + f >= 80){
				data[n] = "A";
			}else if( m + f >= 65) {
				data[n] = "B";
			}else if( m + f >= 50){
				data[n] = "C";
			}else if( m + f >= 30) {
				if( r >= 50) {
					data[n] = "C";
				}else {
					data[n] = "D";
				}
			}else {
				data[n] = "F";
			}
			
			n++;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
}

