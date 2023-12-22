import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];
		for(int i = 0 ; i < k ; i++) d[i] = sc.nextInt();
		for(int i = n ;;i++) {
			boolean ok = true;
			String temp = String.valueOf(i);
			for(int j = 0 ; j < temp.length() ; j++) {
				for(int l = 0 ; l < k ; l++) {
					if(Integer.valueOf(String.valueOf(temp.charAt(j))) == d[l]) ok = false;
				}
			}
			if(ok) {
				System.out.println(i);
				return;
			}
		}
	}
}
