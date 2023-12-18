import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int o;
	int p;
	int q;
	int r;
	int nyuukingoukei;
	int purukingoukei;
	int hizuke = sc.nextInt();
	double[] zenkingoukei = new double[hizuke];
	int [] kingaku = new int[hizuke];
	
	public void nyuryoku(){
		for(n = 0;n <= hizuke-1;n++){
			int nyuukin = sc.nextInt();
			int purukin = sc.nextInt();
			int nyuumai = sc.nextInt();
			int purumai = sc.nextInt();
			o = nyuukin;
			p = purukin;
			q = nyuumai;
			r = purumai;
			nyuukingoukei = o * q;
			purukingoukei = p * r;
			zenkingoukei[n] = nyuukingoukei + purukingoukei;
			if(nyuumai >= 5&&purumai >= 2){
				zenkingoukei[n] = zenkingoukei[n]*(1 - 0.2);
			}else{
				if(nyuumai == 6&& purumai <=1){
					zenkingoukei[n] = (zenkingoukei[n] + p * 2)*(1 - 0.2);
				}
			}
			
		}
		
	}
	
	public void syuturyoku(){
		for(n = 0;n <= hizuke-1;n++){
			System.out.println((int)zenkingoukei[n]);
		}
	}

	public static void main(String[] args) {
		Main toi = new Main();
		toi.nyuryoku();
		toi.syuturyoku();
	}

}