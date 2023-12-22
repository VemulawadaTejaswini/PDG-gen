import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) {

		List<Integer> time=new ArrayList<Integer>();		//キューの処理にかかる時間
		List<String> cue_nm=new ArrayList<String>();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String moto="";
		StringTokenizer stk;
		int cue_su=0;		//もともと与えられたキュー数
		int jikan=0;		//現在の経過時間
		int quantum=0;		//キューの処理時間制限
		int que_zanryo=0;	//キューの残数

		String name="";				//変数保管用
		int suuji=0;
		boolean end=false;

		try {
			moto=bfr.readLine();
			stk=new StringTokenizer(moto, " ");
			cue_su=Integer.parseInt(stk.nextToken());
			quantum=Integer.parseInt(stk.nextToken());

			que_zanryo=cue_su;

			for(int i=0; i<cue_su; i++) {
				moto=bfr.readLine();
				stk=new StringTokenizer(moto," ");
				name=stk.nextToken();
				suuji=Integer.parseInt(stk.nextToken());

				if(suuji>quantum) {
					time.add(suuji-quantum);
					cue_nm.add(name);
					jikan+=quantum;
				}
				else {
					//リストにはついかしない
					jikan+=suuji;
					System.out.println(name+" "+jikan);
				}
			}

			while(true) {
				name=cue_nm.get(0);
				suuji=time.get(0);

				if(suuji>quantum) {
					jikan+=quantum;
					suuji=suuji-quantum;
					cue_nm.remove(0);
					time.remove(0);
					cue_nm.add(name);
					time.add(suuji);
				}
				else {
					jikan+=suuji;
					cue_nm.remove(0);
					time.remove(0);
					System.out.println(name+" "+jikan);
				}

				if(cue_nm.size()<=0) {
					System.exit(0);
				}

				else {
					end=false;
				}
			}

		}catch(IOException e) {
			System.exit(0);
		}
		catch(IndexOutOfBoundsException e) {
			System.exit(0);
		}
	}
}
