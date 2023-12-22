import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		
		if(R<1200){
			System.out.println("ABC");
		}else if(R<2800){
			System.out.println("ARC");
		}else{
			System.out.println("AGC");
		}
	}

}
