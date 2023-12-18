import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t;
		String ti[];
		int count = 0;
		try {
			String w = br.readLine();
			while(true){
				t = br.readLine();
				if(t.equals("END_OF_TEXT")){
					break;
				}
				ti = t.split(" ");
				for(int i = 0 ; i < ti.length ; i++){
					if(w.equals(ti[i])){
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}