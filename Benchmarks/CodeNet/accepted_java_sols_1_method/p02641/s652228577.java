import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int N = scan.nextInt();
		ArrayList<Integer> H = new ArrayList<>();
		for(int i=0;i<N;i++) {
			H.add(scan.nextInt());
		}
		scan.close();

		int min = 100;
		int result = 0;

		for(int i=-100;i<=101;i++) {
			if(!H.contains(i)) {
				int tmp2 = X-i;
				if(tmp2<0) {
					tmp2 = i-X;
				}
				if(tmp2<min) {
					min = tmp2;
					result = i;
				}
			}
		}
		System.out.println(result);
	}
}
