//olume0-0077
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		String s;
		char[] ch;
		int    d;

		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			//calculate
			s = "";
			ch = sc.nextLine().toCharArray();
			for(int i=0;i<ch.length;i++){
				if(ch[i] == '@'){
					i++;
					d = Character.digit(ch[i],10);
					i++;
					for(int j=0;j<d;j++){
						s += String.valueOf(ch[i]);
					}
				} else {
					s += String.valueOf(ch[i]);
				}
			}
			
			//output
			System.out.println(s);
		}
	}
}