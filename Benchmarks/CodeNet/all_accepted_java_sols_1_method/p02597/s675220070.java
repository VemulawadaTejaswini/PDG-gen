import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		boolean[] color = new boolean[s.length()];
		int red = 0;
		int white = 0;
		int lastwhile = -1;
		int count = 0;
		for(int i=0;i<s.length();i++){
			if( s.charAt(i) == 'W' ){
				color[i] = false;
				white++;
				lastwhile = i;
			}else{
				color[i] = true;
				red++;
			}
		}
		if( red == 0 || white == 0 ){
			System.out.println(0);
		}else{
			for(int i=0;i<red;i++){
				if( s.charAt(i) == 'R' )
				count++;
			}
			System.out.println(red-count);
		}
	}
}