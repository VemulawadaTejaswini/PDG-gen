import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb;
		StringBuffer tem;
		String change = null;

		String str = br.readLine();
		int count = Integer.parseInt(br.readLine());
		sb = new StringBuffer(str);

		for(int i = 0; i < count; i++){
			String menu = br.readLine();
			String[] s = menu.split(" ");
			menu = (s[0]);
			int start = Integer.parseInt(s[1]);
			int end = Integer.parseInt(s[2]);

			if(s.length == 4){
				 change = (s[3]);
			}
			if(menu.startsWith("rev")){
				tem = new StringBuffer(sb.substring(start, (end + 1)));
				tem.reverse();
				sb.replace(start, end+1, new String(tem));

			}else if(menu.startsWith("rep")){
				sb.replace(start, end + 1, change);

			}else if(menu.startsWith("p")){
				System.out.println(sb.substring(start, (end + 1)));
			}
		}
	}
}