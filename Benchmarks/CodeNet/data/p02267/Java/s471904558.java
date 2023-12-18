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
			
			for(int i=0; i<bubun_nokazu; i++) {
				for(int j=0; j<suretu_kazu; j++) {
					if(bubun[i]==suretu[j]) {
						gacchi++;
						break;
					}
				}
			}
			System.out.println(gacchi);
		}catch(IOException e) {

		}
	}
}
