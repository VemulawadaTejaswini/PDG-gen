import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxv = -2000000000;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =0;i<N;i++){
			numbers.add(sc.nextInt());
		}
		int minv = numbers.get(0);
		for(int i =1;i<N;i++){
			maxv = Math.max(maxv, numbers.get(i)-minv);
			minv = Math.min(minv, numbers.get(i));
		}
		System.out.println(maxv);

	}

}

