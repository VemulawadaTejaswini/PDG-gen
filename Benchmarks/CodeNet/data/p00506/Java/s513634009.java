import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args){

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		try{
			str=bfr.readLine();

			if(str==null) {
				System.exit(0);
			}
			int suuji=Integer.parseInt(str);

			str=bfr.readLine();

			if(str==null) {
				System.exit(0);
			}

			stk=new StringTokenizer(str , " ");
			int[] moto=new int[suuji];
			int minimum=99999999;

			int aa=0;
			while(stk.hasMoreTokens()) {
				moto[aa]=Integer.parseInt(stk.nextToken());
				aa++;
			}

			List<Integer> yakusu=new ArrayList<>();

			for(int i=0; i<suuji; i++) {
				if(minimum>moto[i]) {
					minimum=moto[i];
				}
			}

			int[] amari=new int[suuji];
			int amariwa=0;

			for(int i=1; i<=minimum; i++) {
				for(int j=0; j<suuji; j++) {
					amari[j]=moto[j]%i;
					amariwa+=amari[j];
				}
				if(amariwa==0) {
					yakusu.add(i);
				}
				amariwa=0;
			}

			for(Integer s : yakusu) {
				System.out.println(s);
			}
		}catch(IOException e) {

		}
		catch(NumberFormatException er) {

		}

	}
}
