import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] aegs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0;
		String t = "";
		/*
		while (true){
			try {
				t = br.readLine();
				if(t == null){
					break;
				}
				a = Integer.parseInt(t);
			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		

		int b = 0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					for(int l=0;l<10;l++){
						if((i+j+k+l) == a){
							b++;
							
						}
					}
				}
			}
		
		}
		
		System.out.println(b);
		}*/
		try {
			t = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		a = Integer.parseInt(t);
		int s = 100000;
		for(int i=0;i<a;i++){
			s = (int) ((double)s * 1.05);
			int ss = s;
			s = s/1000;
			s = s*1000;
			if((ss - s) > 0){
				s = s + 1000;
			}
		}
		System.out.println(s);
		
	}

}