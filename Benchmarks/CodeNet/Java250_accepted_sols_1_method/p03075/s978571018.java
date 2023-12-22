import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int[] point = new int[5];
		int k;
		String ans = "Yay!";
 
		//入力
		for(int i=0; i<point.length; i++) {
			point[i] = sc.nextInt();
		}
		k = sc.nextInt();
 
		cmp: for(int i=0; i<point.length; i++) {
			for(int j=i+1; j<point.length; j++) {
				int p = point[i];
				int q = point[j];
				if((q-p) > k) {
					ans = ":(";
					break cmp;
				}
			}
		}
 
		System.out.println(ans);
 
		sc.close();
	}
}