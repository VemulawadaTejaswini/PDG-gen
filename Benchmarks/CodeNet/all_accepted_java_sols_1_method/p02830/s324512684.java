import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] a_ = sc.next().split("");
		String[] b_ = sc.next().split("");

		ArrayList<String> aa= new ArrayList<String>();

		for(int i=0;i<N;i++){
			aa.add(a_[i]);
			aa.add(b_[i]);
		}
		sc.close();
		for(int i=0;i<aa.size();++i){
			System.out.print(aa.get(i));
		}
	}
}
