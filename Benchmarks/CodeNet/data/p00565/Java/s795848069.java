import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		String mojiretu="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] moji;

		mojiretu=br.readLine();
		int so=Integer.parseInt(mojiretu);
		mojiretu=br.readLine();
		moji=mojiretu.split(" ");
		int[] suji=new int[moji.length+2];
		suji[0]=0; suji[so]=0;
		for(int i=0; i<so; i++) {
			suji[i+1]=Integer.parseInt(moji[i]);
		}
		int nagasa=0;
		boolean tutuki=true;
		int max=0;


		for(int i=0; i<so+2; i++) {
			if(suji[i]==1 && tutuki==false) {
				tutuki=true;
				nagasa++;
			}

			else if(suji[i]==1 && tutuki==true) {
				nagasa++;
			}

			else if(suji[i]==0 && tutuki==true) {
				tutuki=false;
				if(max<nagasa) {
					max=nagasa;
				}
			}

			else if(suji[i]==0 && tutuki==false) {
				//
			}
		}

		System.out.println(max+1);
	}
}
