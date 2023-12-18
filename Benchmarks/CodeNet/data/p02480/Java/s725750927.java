public class Main{
	public static void test(int a){
		System.out.println(a);
	}
	public static int main( String args[] ){
		int a = Integer.parseInt(args[0]);
                test(a*a*a);
	}
}