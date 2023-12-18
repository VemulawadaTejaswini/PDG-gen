import java.util.*;

public class Main {
	public String judgeNengo( int y , int m , int d ) {
		if ( y < 1868 || ( y==1868 && m < 9 ) || ( y==1868 && m==9 && d < 8 ) )
			return "pre-meiji";
		else if ( 1868 <= y && y < 1912 )
			return "meiji";
		else if ( ( y==1912 && m < 7 ) || (y==1912 && m==7 && d < 29 ) )
			return "meiji";
		else if ( 1912 <= y && y < 1926 )
			return "taisho";
		else if ( ( y==1926 && m < 12 ) || ( y==1926 && m==12 && d<24) )
			return "taisho";
		else if ( 1926 <= y && y < 1989 )
			return "showa";
		else if ( y==1989 && d==1 && d < 7 )
			return "showa";
		else return "heisei";
	}
	
	public String getString ( int y , int m , int d ) {
		String nengo = judgeNengo(y,m,d);
		if ( nengo.equals("pre-meiji") )
			return nengo;
		if ( nengo.equals("meiji") )
			return Integer.toString(y-1868+1)+" "+m+" "+d;
		if ( nengo.equals("taisho") )
			return Integer.toString(y-1912+1)+" "+m+" "+d;
		if ( nengo.equals("showa") )
			return Integer.toString(y-1926+1)+" "+m+" "+d;
		else
			return Integer.toString(y-1989+1)+" "+m+" "+d;
	}
	
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while ( sc.hasNext() ) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			System.out.println(m.getString(year,month,day));
		}
	}
}