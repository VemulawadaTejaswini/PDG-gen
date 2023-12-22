import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int count=0;
		while(cin.hasNext()){
			String str = cin.next();
			String re = "";
			for(int i = 0; i < str.length(); i++){
				re += str.charAt(str.length()-1-i);
			}
			if(re.equals(str)){
				count++;
			}
		}
		System.out.println(count);
	

	}

}