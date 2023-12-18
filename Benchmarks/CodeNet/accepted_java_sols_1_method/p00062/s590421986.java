/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String str;
		while(scan.hasNext()){
			str = scan.nextLine();
			while(str.indexOf(" ") != -1){
				String tmp1 = str.substring(0,str.indexOf(" "));
				String tmp2 = str.substring(str.indexOf(" ") + 1,str.length());
				str = tmp1 + tmp2;
			}
			while(str.length() != 1){
				int n = str.length() - 1;
				String tmp = "";
				for(int i = 0;i < n;i++){
					tmp += (Integer.parseInt("" + str.charAt(i)) + Integer.parseInt("" + str.charAt(i + 1))) % 10;
				}
				str = tmp;
			}

			System.out.println(str);
		}
	}

}