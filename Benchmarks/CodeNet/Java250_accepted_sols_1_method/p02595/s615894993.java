import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int ctr = 0;
		while(n--!=0) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			if((Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)))<=d) {
				ctr++;
			}
		}
		System.out.println(ctr);
	}

}