
import java.util.Vector;

class Main{
	public static void main(String[] av){
		Vector<StringBuffer> vec = new Vector<StringBuffer>();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while( sc.hasNext() ){
			vec.add( new StringBuffer(sc.next()) );
		}
		for ( StringBuffer str : vec ){
			System.out.println( str.reverse() );
		}
	}
}