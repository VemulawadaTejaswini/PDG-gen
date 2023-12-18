import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		while (true){
			String str = br.readLine();
			if("".equals(str)) break;
			list.add(str);
		}
		for(int i = 0 ; i < list.size() ; i++){
			String[] spl = list.get(i).split(" ");
			int num = Integer.parseInt(spl[0]) + Integer.parseInt(spl[1]);
			while(num >= 1 ){
				num = num/10;
				ans++;
			}
			System.out.println(ans);
			ans = 0;
		}
		
	}

}