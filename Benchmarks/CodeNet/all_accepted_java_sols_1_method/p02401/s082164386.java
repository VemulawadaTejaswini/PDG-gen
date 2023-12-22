import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		int ans = 0;
		while (true){
			String str = br.readLine();
			if (str.indexOf("?") != -1) break;
			list.add(str);
		}
		for (int i = 0 ;i < list.size() ; i++){
			String[] stra = list.get(i).split(" ");
			int a = Integer.parseInt(stra[0]);
			String op = stra[1];
			int b = Integer.parseInt(stra[2]);
			if("+".equals(op)){
				ans = a+b;
			}else if("-".equals(op)){
				ans = a-b;
			}else if("*".equals(op)){
				ans = a*b;
			}else if ("/".equals(op)){
				ans = a/b;
			}
			System.out.println(ans);
		}
	}

}