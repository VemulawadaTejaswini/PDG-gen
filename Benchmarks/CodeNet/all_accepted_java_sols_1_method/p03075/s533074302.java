import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int[] pos = new int[5];
		for(int i=0;i<pos.length;i++) {
			pos[i] = Integer.parseInt(sc.next());
		}
		
		int k = Integer.parseInt(sc.next());
		
		boolean judge = true;
		int search=4;
		for(;0<search;search--) {
			for(int i=search-1;0<=i;i--) {
				if(k<(pos[search]-pos[i])) {
					judge = false;
				}

			}
		}
		
		if(judge) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
		

	}
}
