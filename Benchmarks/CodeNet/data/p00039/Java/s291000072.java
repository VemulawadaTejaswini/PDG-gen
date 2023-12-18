import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int i, ans = 0;
			String str = scan.next();
			for(i = 0;i < str.length();i++){
				int f = translate(str.charAt(i));
				if(i == str.length() - 1){
					ans += f;
					break;
				}
				int s = translate(str.charAt(i + 1));
				if(f < s){
					ans += s - f;
					i++;
				}else{
					ans += f;
				}
			}
			System.out.println("" + ans);
		}
	}
	static int translate(char c){
		final String rl = "IVXLCDM";
		final int[] val = {1,5,10,50,100,500,1000};
		return val[rl.indexOf(c)];
	}
}