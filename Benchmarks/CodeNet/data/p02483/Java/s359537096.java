import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int s = 0;
		int m = 0;
		int l = 0;

		if(a <= b && b <= c){
			s = a;
			m = b;
			l = c;
		}else if(a >= b && b >= c){
			s = c;
			m = b;
			l = a;
		}else if(a <= b){
			l = b;
			if(a <= c){
				s = a;
				m = c;
			}else{
				s = c;
				m = a;
			}
		}else if(a >= b){
			s = b;
			if(a <= c){
				m = a;
				l = c;
			}else{
				m = c;
				l = a;
			}
		}

		System.out.println(s + " " + m + " " + l);


	}

}