import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			final int ope_num = Integer.parseInt(br.readLine());
			Dictionary(ope_num,br);
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	//enum宣言
	public static enum Operate{
		insert("insert"),
		find ("find"),;
		
		private final String name;
		
		Operate(String name){
			this.name = name;
		}
		
		String getName(){
			return this.name;
		}

		public static Operate getEnumName(String str){
			for(Operate v : values()){
				if(v.getName().equals(str)){
					return v;
				}
			}
			throw new IllegalArgumentException("undefined : " + str);
		}
	}

	public static void Dictionary( int ope_num ,BufferedReader br ){
		HashMap<String,Integer> que = new HashMap<String,Integer>();
		int i;
		int count = 0;
		
		for ( i = 0; i < ope_num; i++) {
			try {
				final String[] op = br.readLine().split(" ");		//キーと命令を分割
			 
				switch( Operate.getEnumName(op[0]) ){				//命令によって処理
				case insert:
					que.put(op[1],count);							//最後尾に随時追加していく
					count ++;
					break;
				case find:	
					if( que.containsKey(op[1]) ) {					//一致したらYes
						System.out.println("yes");
					}else {
						System.out.println("no");
					}
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
