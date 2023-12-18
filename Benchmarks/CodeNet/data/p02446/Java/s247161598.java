import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			ArrayList<Integer> A = new ArrayList<>();
			for(int i=0;i<n;i++){
				A.add(sc.nextInt());
			}
			ListIterator<Integer> AI = A.listIterator();
			int prev = AI.next();
			while(AI.hasNext()) {
				if(prev == AI.next()) {
					AI.remove();
				}else {
					prev = AI.previous();
					AI.next();
				}
			}
			AI = A.listIterator();
			System.out.print(AI.next());
			while(AI.hasNext()) {
				System.out.print(" " + AI.next());
			}
			System.out.println();
		}
	}
}
