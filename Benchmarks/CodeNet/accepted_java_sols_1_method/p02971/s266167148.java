import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0 ; i< N ; i++) {
			
			a.add(sc.nextInt());
			
		}

		ArrayList<Integer> b = new ArrayList<Integer>(a);
		
		
		Collections.sort(b, Collections.reverseOrder());
		
		for(int i = 0; i< N ; i++) {
			
			if(a.get(i) == b.get(0)){
				System.out.println(b.get(1));
			} else {
				System.out.println(b.get(0));
			}
			
			
			
			
		}
		

	}

}