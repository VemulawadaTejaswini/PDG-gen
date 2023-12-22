import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int m = scan.nextInt();
		int arr[] = new int[n];
		Set<Integer> s = new HashSet<>();
		for(int i = 0 ; i < n ; i++) {

			ArrayList<Integer> a = new ArrayList<>();
			int u = scan.nextInt();
			for(int j = 0 ; j <u ; j++){
			     if(i == 0) {
			    	 s.add(scan.nextInt()) ;
			     }else {
			    	 a.add(scan.nextInt()) ;
			     }
			}
			if(i!=0)
				s.retainAll(a);
		}
		
		System.out.println(s.size());
		

	}
}