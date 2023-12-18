public class Main{
	public static void test(int a){
		System.out.println(a);
	}
	public static void main( String args[] ){
                if ( args.length() != 1 ) return;
		int a = Integer.parseInt(args[0]);
                test(a*a*a);
	}
}