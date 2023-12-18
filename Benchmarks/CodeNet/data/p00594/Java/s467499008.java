import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main{
	public static void main_(String args[]){
		(new Main_()).sets();
	}

	HashMap<String, OriginalSet> setsEnvironment;
	OriginalSet setU;

	void sets(){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		setsEnvironment = new HashMap<String, OriginalSet>();

		setU = new OriginalSet();

		// 集合定義のためのハッシュ
		try{
			while((str = br.readLine()) != null){
				int n = Integer.parseInt(str);
				if(n == 0) return;

				str = br.readLine();
				String array[] = str.split(" ");
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}
}