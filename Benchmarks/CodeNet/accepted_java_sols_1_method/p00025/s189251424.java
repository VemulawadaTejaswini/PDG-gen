import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int[] a = new int[4];
			int[] b = new int[4];
			boolean[] bl = new boolean[10];
			for(int i=0;i<4;i++) {
				a[i] = sc.nextInt();
				bl[a[i]] = true;
			}
			for(int i=0;i<4;i++) {
				b[i] = sc.nextInt();
			}
			int hit = 0;
			int blow = 0;
			for(int i=0;i<4;i++) {
				if (b[i] == a[i]) {
					hit++;
				}else if(bl[b[i]]) {
					blow++;
				}
			}
			System.out.println(hit + " " + blow);
		}
	}

}