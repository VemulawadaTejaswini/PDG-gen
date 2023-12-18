import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String f = r.readLine();
		int a = Integer.parseInt(f);
		int d = 1;
		if(a == 0){
			return;
		}else{
			System.out.println("Case "+d+": "+a);
			d++;
			while(a > 1){
				BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
				String wf= r.readLine();
				int q = Integer.parseInt(wf);
				System.out.println("Case "+d+": "+q);
				d++;
			}
		}
	}

}