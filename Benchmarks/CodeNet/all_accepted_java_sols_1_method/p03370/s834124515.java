import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n = 0;
		int x = 0;
		int nokori = 0;
		int kosuu = 0;

		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		x = Integer.parseInt(scan.next());
		nokori = x;
		kosuu = n;

		int okashi[] = new int[n];
		for(int i=0;i<n;i++) {
			okashi[i] = Integer.parseInt(scan.next());
			nokori = nokori - okashi[i];
		}

		int min = 0;
		for(int j=0;j<n;j++) {
			if(j==0) {
				min = okashi[j];
			}else if(min > okashi[j]) {
				min = okashi[j];
			}
		}
		int kosuu_a = nokori/min;

		kosuu = kosuu + kosuu_a;

		System.out.println(kosuu);
	}
}
