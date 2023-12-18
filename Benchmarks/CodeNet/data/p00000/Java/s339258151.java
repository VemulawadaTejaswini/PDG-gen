public class Main {

	public static void main(String[] x_args) {
		for (int i = 1; i <= 9; i++) {
			kuku_keisan(i);			
		}
	}
	
	public static void kuku_keisan(int kuku_dan) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(kuku_dan + "x" + i + "=" + i * kuku_dan);
		}

	}
}