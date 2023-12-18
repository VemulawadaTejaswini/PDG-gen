
public class QQ {
	public static void main(String[] args) {
		printQQ();
	}
	public static void printQQ() {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}