public class MultiplicationTbl {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		
		for (x = 1; x <= 10; x++){
			for (y = 1; y <= 10; y++){
				z= x*y;
				System.out.println(x + "x" + y + "=" + z);
			}
		}
	}

}