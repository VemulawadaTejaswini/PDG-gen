import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for(int i = 0 ; i < 4 ; i++){
			int t = sc.nextInt();
			int n = sc.nextInt();
			switch (t) {
			case 1:
				a[i] = n * 6000;
				break;
			case 2:
				a[i] = n * 4000;
				break;
			case 3:
				a[i] = n * 3000;
				break;
			case 4:
				a[i] = n * 2000;
				break;
			}
		}
		for(int j : a){
			System.out.println(j);
		}
		sc.close();
	}

}