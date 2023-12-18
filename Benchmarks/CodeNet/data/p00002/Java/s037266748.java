import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		int a = 0, b = 0, cnt = 0;
		int[] keta = new int[200];
		Scanner scan = new Scanner(System.in);
		while (cnt <= 200) {
			a = Integer.valueOf(scan.next());
			b = Integer.valueOf(scan.next());
			if ((0 <= a) && (b <= 1000000)){
				keta[cnt]=String.valueOf(a+b).length();
			}else{
				break;
			}
			cnt++;
		}
		scan.close();
		for(int abc=0;abc<cnt;abc++){
			System.out.println(keta[abc]);
		}
	}
}