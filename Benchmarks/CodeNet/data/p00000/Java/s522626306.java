package test;

public class Test {

	
	public static void main(String[] args) {
		
		
		for(int x = 1; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				System.out.printf("%dx%d=%d\n", x, y, x * y);
			}
		}
	}
}