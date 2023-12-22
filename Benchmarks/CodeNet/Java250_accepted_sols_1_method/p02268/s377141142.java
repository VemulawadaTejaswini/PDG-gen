import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {

		int suretu_kazu=0;
		int[] suretu;
		int bubun_nokazu=0;
		int[] bubun;
		String moji="";
		String[] srt;
		String[] bbn;
		int gacchi=0;

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));

		try {
			moji=bfr.readLine();
			suretu_kazu=Integer.parseInt(moji);
			moji=bfr.readLine();
			srt=moji.split(" ");
			suretu=new int[suretu_kazu];
			for(int i=0; i<suretu_kazu; i++) {
				suretu[i]=Integer.parseInt(srt[i]);
			}
			moji=bfr.readLine();
			bubun_nokazu=Integer.parseInt(moji);
			moji=bfr.readLine();
			bbn=moji.split(" ");
			bubun=new int[bubun_nokazu];
			for(int i=0; i<bubun_nokazu; i++) {
				bubun[i]=Integer.parseInt(bbn[i]);
			}

			int hidari=0;
			int migi=suretu_kazu;
			int mid=0;

			for(int i=0; i<bubun_nokazu; i++) {
				hidari=0;
				migi=suretu_kazu;
				mid=0;
				while(hidari<migi) {
					mid=(hidari+migi)/2;
					if(suretu[mid]==bubun[i]) {		//探したい値と探す配列のまん中の数字と一致した時合致
						gacchi++;
						break;
					}
					else if(bubun[i]<suretu[mid]) {		//真ん中の数字と探したい数字の大小　真ん中のほうが大きいときは　右（MAX）が真ん中
						migi=mid;
					}
					else {				//中央が探すものより小さい時、一番左を大きくする。
						hidari=mid+1;
					}
				}
			}
			System.out.println(gacchi);
		}catch(IOException e) {

		}
	}
}
