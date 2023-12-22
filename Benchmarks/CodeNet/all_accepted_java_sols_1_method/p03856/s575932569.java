import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		s = s.replace("eraser","Q");
		s = s.replace("erase","Q");
		s = s.replace("dreamer","Q");
		s = s.replace("dream","Q");
		for( int i=0; i<s.length(); i++ ){
			if( s.charAt(i)!='Q' ){
				System.out.println("NO");
				break;
			}
			if( i==s.length()-1 ){
				System.out.println("YES");
			}
		}	
	}
}
