
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[2];
		int n=0;
		int x=0;

		//入力
		try {
			int count=0;	//結果をカウントする
			while(true){
				//nとmとrの入力
				work=br.readLine().split("\\s+");
				n=Integer.parseInt(work[0]);
				x=Integer.parseInt(work[1]);
				
				if(n==0 && x==0) {break;}	//終了条件
				
				//組み合わせを判定する
				
				for(int i=1; i<=n-2; i++) {
					for(int j=i+1; j<=n-1; j++) {
						for(int k=j+1; k<=n; k++) {
							if(x==(i+j+k)) {
								count++;
							}
						}
					}
				}
				sb.append(count);
				sb.append(String.format("%n", ""));
				count=0;
			}	
			
			//出力
			System.out.print(sb);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
