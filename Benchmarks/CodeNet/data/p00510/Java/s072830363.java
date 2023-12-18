//Volume5-0587
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n   = sc.nextInt(),
		    m   = sc.nextInt(),
		    max = m;

		while(n-- > 0){
			m += sc.nextInt();
			m -= sc.nextInt();
			if(max < m){
				max = m;
			}
			if(m < 0){max = 0; break;}
		}
		System.out.println(max);
	}
}