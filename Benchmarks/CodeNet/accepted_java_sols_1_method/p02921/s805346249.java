import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		//Sは天気予報、Tは実際の天気
		char [] s = stdIn.next().toCharArray();
		char [] t = stdIn.next().toCharArray();
		
		int count = 0;
		for(int i = 0; i < s.length; i++){
			if(s[i]== t[i]){
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
