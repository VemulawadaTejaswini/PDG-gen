import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int h = scan.nextInt();
			int m = scan.nextInt();
			int s = scan.nextInt();
			h = scan.nextInt() - h;
			m = scan.nextInt() - m;
			s = scan.nextInt() - s;
			while(h < 0 || m < 0 || s < 0){
				if(s < 0){
					m -= 1;
					s += 60;
				}
				if(m < 0){
					h -= 1;
					m += 60;
				}
			}
			System.out.println(h + " " + m + " " + s);
		}
	}
}