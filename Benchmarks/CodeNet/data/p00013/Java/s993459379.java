import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		String[] rrr;
		int st = 0;
		Stack stack = new Stack();
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			if(tmp.equals("")){
				break;
			}
			
			st = Integer.parseInt(tmp);
			
			if(st != 0){
				stack.push(st);
			}else{
				System.out.println(stack.pop());
			}
			
			
		}
	}

}