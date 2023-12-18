import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bk;
		String str = br.readLine();
		int count = Integer.parseInt(br.readLine());
		int start = 0;
		int end = 0;
		String change = null;

		for(int i = 0; i < count; i++){
			bk = new StringBuffer(str);
			String menu = br.readLine();
			String[] s = menu.split(" ");
			start = Integer.parseInt(s[1]);
			end = Integer.parseInt(s[2]);

			if(s.length == 4){
				 change = s[3];
			}

			if(s[0].equals("replace")){
				bk.replace(start, end, change);
			}else if(s[0].equals("reverse")){
				StringBuffer result =new StringBuffer(bk.substring(start, end));
				result.reverse();
				bk.insert(start, result);
			}else if(s[0].equals("print")){
				System.out.println(bk.substring(start,end));
			}
		}
	}
}