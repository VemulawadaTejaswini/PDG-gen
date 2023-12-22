import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> ans = new ArrayDeque<String>();

		while(sc.hasNext()){
			String s = sc.next();
			String stn = "";
			for(int i=0;i<s.length();i++){
				String t = s.substring(i,i+1);
				if(t.compareTo("@")==0){
					int len = Integer.valueOf(s.substring(i+1,i+2));
					for(int j=0;j<len;j++){
						stn += s.substring(i+2,i+3);
					}
					i+=2;
				}else{
					stn += t;
				}
			}
			ans.push(stn);
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}