import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int ans=0;
		while(cin.hasNext()){
			String str = cin.next();
			char[] s = (str+"       ").toCharArray();
			ans += secret(s);
		}
		System.out.println(ans);
	}
	static int secret(char[] s){
		int re = 0;
		for(int i = 0;i<s.length;i++){
			if(Character.isDigit(s[i])){
				String str = ""+s[i];
				for(int j =i+1;j<s.length;j++){
					if(Character.isDigit(s[j])){
						str = str + s[j];
					}
					else{
						i=j;
						break;
					}
				}
				re += Integer.parseInt(str);
			}
		}
		
		return re;
	}
}