import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	int N;

	public static void main(String[] args){

		N = scan.nextInt();
		String[] cards = new String[N];
		String[] copys = new String[N];
		String[] ins = new String[N];
		for(int i = 0; i < N; i++){
			cards[i] = scan.next();
			copys[i] = cards[i];
			ins[i] = cards[i];
		}

		// ??????????????????
		for(int i = 0; i < N; i++){
			for(int j = N-1; j >= i+1; j--){
				String sj = card[j].substring(1);
				String sjj = cards[j-1].substring(1);
				int vj = Interger.parseInt(sj);
				int vjj = Integer.parseInt(sjj);
				if(vj < vjj){
					String work = cards[j];
					cards[j] = cards[j-1];
					card[j-1] = work;
				}
			}
		}

		for(int i = 0; i < N; i++){
			System.out.printf(i != N-1? "%d " : "%d\n", cards[i]);
		}
		System.out.printf("%s\n", isStable(ins, cards)? "Stable" : "Not stable");

		// ???????????????
		for(int i = 0; i < N; i++){
			int minj = i;
			for(int j = i; i < N; j++){
				String sj = copys[j].substring(1);
				String sjj = copys[minj].substring(1);
				int vj = Integer.parseInt(sj);
				int vjj = Integer.parseInt(sjj);
				if(vj < vjj){
					minj = j;
				}
			}
			if(i != minj){
				String work = copys[minj];
				copys[minj] = copys[i];
				copys[i] = work;
			}
		}

		for(int i = 0; i < N; i++){
			System.out.printf(i != N-1? "%d " : "%d\n", copys[i]);
		}
		System.out.printf("%s\n", isStable(ins, copys)? "Stable" : "Not stable");
	}

	public static boolean isStable(String[] in, String[] out){
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				for(int a = 0; a < N; a++){
					for(int b = a+1; b < N; b++){
						String si = in[i].substring(1);
						String sj = in[j].substring(1);
						int vi = Integer.parseInt(si);
						int vj = Integer.parseInt(sj);
						if(vi == vj && in[i].equals(out[b]) && in[j].equals(out[a])){
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}