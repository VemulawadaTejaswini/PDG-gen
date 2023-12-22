class Main{
    public static void main(String[] a){
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10 ; j++) {
				int calc = i * j;
				System.out.println(String.valueOf(i) + "x" + String.valueOf(j) + "=" + String.valueOf(calc));
			}
		}
    }
}