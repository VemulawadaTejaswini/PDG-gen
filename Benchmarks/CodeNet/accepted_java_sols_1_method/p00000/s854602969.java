public class Main{
	public static void main(String[] s){
		for(int i=10;++i<100;){
			System.out.printf(i%10>0?"%dx%d=%d\n":"",i/10,i%10,i/10*(i%10));
		}
	}
}