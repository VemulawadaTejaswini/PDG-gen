import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		String u = "U",r = "R",d = "D",l = "L";
		for( int i=0; i<ty-sy-1; i++ ){
			u += "U";
		}
		for( int i=0; i<tx-sx-1; i++ ){
			r += "R";
		}
		for( int i=0; i<ty-sy-1; i++ ){
			d += "D";
		}
		for( int i=0; i<tx-sx-1; i++ ){
			l += "L";
		}
		System.out.println(u+r+d+l+"L"+u+"U"+"R"+r+"D"+"R"+d+"D"+"L"+l+"U");
	}
}
