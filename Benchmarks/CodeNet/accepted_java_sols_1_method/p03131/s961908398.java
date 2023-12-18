import java.util.Scanner;

public class Main {
	static long Biscuit = 1;
	static long Coin = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int Coinlate = Integer.parseInt(sc.next());
		int Biscuitlate = Integer.parseInt(sc.next());
		sc.close();

		//boolean Exchangeflag = false;
		if(Biscuitlate - Coinlate>= 3) {
			//Exchangeflag = true;
		}else {
			System.out.println((Biscuit+n));
			return;
		}

		for (int i=0;i<n-1;i++) {
			if(Coin >= 1) {
				Coin--;
				Biscuit += Biscuitlate;
				continue;
			}
			if(Biscuit < Coinlate) {
				Biscuit++;continue;
			}
			if(Biscuit >= Coinlate) {
				Biscuit-=Coinlate;
				Coin ++;continue;
			}
		}
		if(Coin >= 1) {
			Coin--;
			Biscuit += Biscuitlate;
		}else {
			Biscuit++;
		}

		System.out.println(Biscuit);

	}

}