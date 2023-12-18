import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int H = keyboard.nextInt();
		int W = keyboard.nextInt();
		int M = keyboard.nextInt();
		
		HashMap<Long, Integer> Bakuha = new HashMap<Long, Integer>();
		long MaxH = 3*100000;
		int[]sumH = new int[H];
		int[]sumW = new int[W];
		int SH = 0;
		int SW = 0;
		
		for(int i = 0; i<M; i++) {
			int inH = keyboard.nextInt()-1;
			int inW = keyboard.nextInt()-1;
			Bakuha.put((inH*MaxH)+inW, 1); 
			sumH[inH] ++;
			sumW[inW] ++;
			if(sumH[inH]>= SH) {
				SH = sumH[inH];
			} 
			if(sumW[inW]>= SW) {
				SW = sumW[inW];
			}
		}
		
		ArrayList<Integer> SHindex = new ArrayList<Integer>();
		ArrayList<Integer> SWindex = new ArrayList<Integer>();
		
		for(int h=0; h<H; h++) {
			if(sumH[h] == SH) {
				SHindex.add(h);
			}
		}	
		for(int w=0; w<W; w++) {
			if(sumW[w] == SW) {
				SWindex.add(w);
			}	
		}
		
		int ans = SH+SW-1;//最低の爆破可能数、鳩の巣に被っている
		
		if(SHindex.size()*SWindex.size() > M) {//鳩の巣Mより交点の数が大きいとき
			ans = SH+SW;
		}else {//鳩の巣Mより交点の数が小さいとき、交点は鳩の巣に被っているかもしれない
			for(int i=0; i<SHindex.size(); i++) {
				for(int j=0; j<SWindex.size(); j++) {
					if (!Bakuha.containsKey(SHindex.get(i)*MaxH+SWindex.get(j))) { //HashMapに既にキーがないとき、鳩の巣に被っていない
						ans = SH+SW;
					}
				}
			}
		}
		
		System.out.print(ans);
		keyboard.close();
	}
}
