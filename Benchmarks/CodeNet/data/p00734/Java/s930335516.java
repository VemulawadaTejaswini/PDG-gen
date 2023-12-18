import java.util.*;



public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static int[] card_n, card_m;

	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read() == true){
			solve();
		}
	}


	public static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();

		if(n==0 && m==0) return false;

		card_n = new int[n];
		card_m = new int[m];

		for(int i=0; i<n; i++){
			card_n[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++){
			card_m[i] = sc.nextInt();
		}
		Arrays.sort(card_n);
		Arrays.sort(card_m);

		return true;
	}

	public static void solve(){
		int total_n=0, total_m=0;
		for(int i=0; i<card_n.length; i++){
			total_n += card_n[i];
		}
		for(int i=0; i<card_m.length; i++){
			total_m += card_m[i];
		}

		if((total_n-total_m)%2 == 0){
			for(int i=0; i<card_n.length; i++){
				for(int j=0; j<card_m.length; j++){
					if((total_n-total_m)/2 == card_n[i]-card_m[j]){
						System.out.println(card_n[i] + " " +card_m[j]);
						return;
					} else{
						continue;
					}
				}
			}
		}


		System.out.println(-1);



	}
}