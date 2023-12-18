import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cleaning Robot
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1020&lang=jp
 *
 * @author Igari Kazuya
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();

			if(n == 0){
				break;
			}

			String s,t,b;
			s = sc.next();
			t = sc.next();
			b = sc.next();

			int[] scoremap = new int[9];
			int[] bufmap = new int[9];
			for(int i=0;i<3;i++){
				scoremap[i] = 0;
				bufmap[i] = 0;
			}

			int ss = s.charAt(0) - 'A';
			int tt = t.charAt(0) - 'A';
			int bb = b.charAt(0) - 'A';

			scoremap[ss] = 1;//ツ機ツ械ツつソツづ。ツづア

			for(int i=0;i<n;i++){
				for(int k=0;k<9;k++){
					if(k-1 >= 0 && k-1 != bb){
						bufmap[k-1] += scoremap[k];
					}else{
						bufmap[k] += scoremap[k];
					}
					if(k-3 >= 0 && k-3 != bb){
						bufmap[k-3] += scoremap[k];
					}else{
						bufmap[k] += scoremap[k];
					}
					if(k+1 <= 8 && k+1 != bb){
						bufmap[k+1] += scoremap[k];
					}else{
						bufmap[k] += scoremap[k];
					}
					if(k+3 <= 8 && k+3 != bb){
						bufmap[k+3] += scoremap[k];
					}else{
						bufmap[k] += scoremap[k];
					}
				}
				for(int k=0;k<9;k++){
					scoremap[k] = bufmap[k];
					bufmap[k] = 0;
				}
			}

			int count=0;
			for(int i=0;i<9;i++){
				count += scoremap[i];
			}
			System.out.printf("%.8f\n",scoremap[tt]/(double)count);
		}
	}
}