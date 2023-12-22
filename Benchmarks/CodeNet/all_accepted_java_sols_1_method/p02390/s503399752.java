import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = 0, m = 0, h = 0;
		s = sc.nextInt();
		while(s >= 60){
			m=m+1;
			s = s-60;
			while(m >= 60){
				h=h+1;
				m = m-60;
			}
		}
		System.out.println(h+":"+m+":"+s);
	}
}

