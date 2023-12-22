import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			List<Integer> A = new ArrayList<>();
			for(int i=0;i<q;i++) {
				int query = sc.nextInt();
				if(query==0) {
					A.add(sc.nextInt());
				}
				else if(query==1) {
					System.out.println(A.get(sc.nextInt()));
				}
				else if(query==2) {
					A.remove(A.size()-1);
				}
			}
		}
	}
}
