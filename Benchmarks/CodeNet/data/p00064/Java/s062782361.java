import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Main{
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(sc.hasNext()){
			String str = sc.next();
			ArrayList<String> list = new ArrayList<String>();
			
			for(int i=0; i<str.length(); ++i){
				String s = "";
				while(true){
					char c = str.charAt(i);
					if('0' <= c && c <= '9'){
						s += new String(new char[]{c});
					}else{
						break;
					}
					
					if(str.length() <= ++i){
						break;
					}
				}
				if(!s.equals("")){
					--i;
					list.add(s);
				}
			}
			
			for(int i=0; i<list.size(); ++i){
				sum += Integer.parseInt(list.get(i));
			}
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}