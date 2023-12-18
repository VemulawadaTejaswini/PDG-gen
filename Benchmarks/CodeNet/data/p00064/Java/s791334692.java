import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int sum = 0;
		while(cin.hasNext()){
			String str = cin.next();
			char[] s = (str + " " ).toCharArray();
			int ans = 0;
			for(int i = 0; i < s.length; i++){
				ArrayList<Integer> list = new ArrayList<Integer>();
				if(Character.isDigit(s[i])){
					while(true){
						list.add(s[i]-'0');
						if(Character.isDigit(s[i+1])){
							i++;
						}
						else{
							break;
						}
					}
					for(int j = 0; j < list.size(); j++){
						sum += list.get(j)*Math.pow(10, list.size()-1-j);
					}
				}
			}
		}
		System.out.println(sum);
	}

}