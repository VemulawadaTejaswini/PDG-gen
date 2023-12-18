
public class Main{
	
	public static void main(String[] args){

		System.out.println(Sx2dx(10, 600));
	}
	
	static int sq(int x) {
		return x * x;
	}
	
	static int Sx2dx(int d, int width) {
		int result = 0;
		for(int i = 0; i < width / d; i++) {
			result += sq(d * i) * d;
		}
		return result;
	}
}