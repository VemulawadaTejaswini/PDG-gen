class Main{
    public static void main(String[] a){
                int x = 0;
		int y = 0;
		int z = 0;
		
		for (x = 1; x <= 9; x++){
			for (y = 1; y <= 9; y++){
				z= x*y;
				System.out.println(x + "x" + y + "=" + z);
			}
		}

    }
}