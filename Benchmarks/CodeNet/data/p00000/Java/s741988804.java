class Main{
    public static void main(String[] arg){
        for (int i = 0; i < 9 * 9; i++) {
			int a = i / 9 + 1;
			int b = i % 9 + 1;

			System.out.println(a + " * " + b + " = " + a * b);

	}


    }
}