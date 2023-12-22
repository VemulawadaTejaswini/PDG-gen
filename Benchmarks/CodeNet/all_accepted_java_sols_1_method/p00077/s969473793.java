import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			String ans = "";
			for(int i = 0; i < str.length();i++){
				if(str.charAt(i)=='@'){
					i++;
					int c = str.charAt(i)-'0';
					i++;
					for(int j = 0;j  < c;j++){
						ans+=str.charAt(i);
					}
				}
				else{
					ans+=str.charAt(i);
				}
			}
			System.out.println(ans);
		}
	}

}