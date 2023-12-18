import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int kaijyou = 1;
			int n = sc.nextInt();
			int k = n;
			if( n  == 0){
				System.out.println("1");
				break;
			}
			for (int i = 0; i < n; i++) {
				kaijyou = kaijyou * k;
				k--;
			}
			System.out.println(kaijyou);
		}
	}
}