import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<Integer> num= new ArrayList<Integer>();
		Scanner input= new Scanner(System.in);
		int x=input.nextInt();
		while(x!=0){
			num.add(x);
			x=input.nextInt();
		}
		for (int i=0;i<num.size() ;i++ ) {
			System.out.printf("Case %d: %d%n",(i+1),num.get(i));
		}
	}
}