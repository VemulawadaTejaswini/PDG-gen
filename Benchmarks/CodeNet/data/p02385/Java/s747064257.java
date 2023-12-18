import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int fst_top = sc.nextInt();
		int fst_front = sc.nextInt();
		int fst_left = sc.nextInt();
		int fst_right = sc.nextInt();
		int fst_back = sc.nextInt();
		int fst_bottom = sc.nextInt();

		int snd_top = sc.nextInt();
		int snd_front = sc.nextInt();
		int snd_left = sc.nextInt();
		int snd_right = sc.nextInt();
		int snd_back = sc.nextInt();
		int snd_bottom = sc.nextInt();

		boolean ok = false;
		for (int v = 0; v <= 4; v++) {

			for (int t = 0; t < 4; t++) {
				//System.out.println(fst_top + " " + fst_front + " " + fst_left + " " + fst_right + " " + fst_back + " " + fst_bottom);
				
				if(fst_top == snd_top && fst_front == snd_front && fst_left == snd_left && 
						fst_right == snd_right && fst_back == snd_back && fst_bottom == snd_bottom){
					ok = true;
				}
				
				int tmp = fst_bottom;
				fst_bottom = fst_right;
				fst_right = fst_top;
				fst_top = fst_left;
				fst_left = tmp;
			}

			int tmp = fst_bottom;
			fst_bottom = fst_front;
			fst_front = fst_top;
			fst_top = fst_back;
			fst_back = tmp;
		}

		System.out.println(ok ? "Yes" : "No");
	}
}