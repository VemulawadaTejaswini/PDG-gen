import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int scount = sc.nextInt();
		int tcount = sc.nextInt();

		String u = sc.next();
		
		if(s.equals(u)) {
			scount = --scount; 
			
		}else {
			tcount= --tcount;
		}
		

		System.out.println(scount+" "+tcount);
		

	}
}