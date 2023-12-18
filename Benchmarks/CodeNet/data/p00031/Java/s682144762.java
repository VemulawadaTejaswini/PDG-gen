import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			ArrayList<Integer> ar = new ArrayList<>();
			int n = sc.nextInt();
			for(int i = 0; i < 10; i++){
				if( (n & (1 << i)) > 0) ar.add(1<<i);
			}
			System.out.print(ar.get(0));
			for(int i = 1; i < ar.size(); i++) {
				System.out.print(" " + ar.get(i));
			}
			System.out.println();
		}
	}
}