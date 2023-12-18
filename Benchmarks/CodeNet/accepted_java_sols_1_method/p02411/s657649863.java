import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m,f,r;
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		while(!(m == -1 && f == -1 && r == -1)){
			if(m == -1 || f == -1){
				System.out.println("F");
				m = sc.nextInt();
				f = sc.nextInt();
				r = sc.nextInt();
				continue;
			}
			if(m == -1){
				m = 0;
			}
			
			if(f == -1){
				f = 0;
			}
			if(m + f >= 80){
				System.out.println("A");
			}else if(m + f >= 65 && m + f < 80){
				System.out.println("B");
			}else if(m + f >= 50 && m + f < 65){
				System.out.println("C");
			}else if(m + f >= 30 && m + f < 50){
				if(r >= 50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else{
				System.out.println("F");
			}
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
	}
}