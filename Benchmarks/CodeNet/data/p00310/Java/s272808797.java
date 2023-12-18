import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		List kazu=new ArrayList<Integer>();
		int sousuu=0;

		try {
			str=bfr.readLine();
			stk=new StringTokenizer(str," ");

			while(stk.hasMoreTokens()) {
				sousuu+=Integer.parseInt(stk.nextToken());
			}

			System.out.println(sousuu);


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
