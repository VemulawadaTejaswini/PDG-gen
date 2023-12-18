import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		String[] rrr;
		
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
			
			rrr = tmp.split(",");
			
			if(rrr[0].equals("A") && cup == 0){
				if(rrr[1].equals("B")){
					cup = 1;
				}else if(rrr[1].equals("C")){
					cup = 2;
				}
			}else if(rrr[0].equals("B") && cup == 1){
				if(rrr[1].equals("A")){
					cup = 0;
				}else if(rrr[1].equals("C")){
					cup = 2;
				}
			}else if(rrr[0].equals("C") && cup == 2){
				if(rrr[1].equals("A")){
					cup = 0;
				}else if(rrr[1].equals("B")){
					cup = 1;
				}
			}else if(rrr[1].equals("A") && cup == 0){
				if(rrr[0].equals("B")){
					cup = 1;
				}else if(rrr[0].equals("C")){
					cup = 2;
				}
			}else if(rrr[1].equals("B") && cup == 1){
				if(rrr[0].equals("A")){
					cup = 0;
				}else if(rrr[0].equals("C")){
					cup = 2;
				}
			}else if(rrr[1].equals("C") && cup == 2){
				if(rrr[0].equals("A")){
					cup = 0;
				}else if(rrr[0].equals("B")){
					cup = 1;
				}
			}
			
		}
		
		if(cup == 0){
			System.out.println("A");
		}else if(cup == 1){
			System.out.println("B");
		}else if(cup == 2){
			System.out.println("C");
		}
		
		
		
		
	}

}