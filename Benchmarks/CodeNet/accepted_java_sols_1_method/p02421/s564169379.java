import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			int taro = 0;
			int hanako = 0;
			for (int i=0; i<n; i++) {
				String tcard = sc.next();
				String hcard = sc.next();
				if (tcard.equals(hcard)) {  //同じカードでしたら
					taro++;
					hanako++;
				} else {
					if (tcard.compareTo(hcard) > 0) taro+= 3;
					else hanako+= 3;
				}
			}
			System.out.println(taro + " " + hanako);
		}
	}
}
