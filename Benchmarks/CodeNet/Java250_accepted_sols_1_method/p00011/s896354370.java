import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int[] lot_num = new int[w];
		int n = sc.nextInt();
		int a,b,swap;
		String str;

		for(int i=0; i<w; i++){
			lot_num[i] = i+1;
		}
		
		for(int i=0; i<n; i++){
			str = sc.next();
			String[] num = str.split(",");
 			a = Integer.parseInt(num[0]);
			b = Integer.parseInt(num[1]);
			swap = lot_num[a-1];
			lot_num[a-1] = lot_num[b-1];
			lot_num[b-1] = swap;
		}

		for(int i=0; i<w; i++){
			System.out.println(lot_num[i]);
		}
	}
}