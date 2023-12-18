import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N =cin.nextInt();
		while(N--!=0){
			String str = cin.next();
			char[] s = (str+"       ").toCharArray();
			int idx=0;
			String ans="";
			ans += s[idx++];
			while(true){
				if(idx>=str.length()){
					break;
				}
				if(s[idx]=='-'){
					idx++;idx++;
					if(!ans.contains(s[idx]+"")){
						ans = ans+s[idx];
					}
				}
				else{
					idx++;idx++;
					if(!ans.contains(s[idx]+"")){
						ans = s[idx]+ans;
					}
				}
				idx++;
			}
			System.out.println(ans);
			
		}
	}

}