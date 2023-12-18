import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		// 集合定義のためのハッシュ
		try{
			while((str = br.readLine()) != null){
				int n = Integer.parseInt(str);
				if(n == 0) return;

				str = new String();
				while(true){
					char c = (char)br.read();
					if(c == ' '){
						//System.out.println(str);
						str = new String();
						continue;
					}
					str += c;
				}
				//String array[] = str.split(" ");
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}
}