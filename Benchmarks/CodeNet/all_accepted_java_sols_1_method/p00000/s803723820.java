class Main {
	public static void main(String[] a) {

		// ?????°???
		int arg1[] = {1,2,3,4,5,6,7,8,9};
		// ?????°???
		int arg2[] = {1,2,3,4,5,6,7,8,9};

		for(int i =0; i<9; ++i){
			for(int j = 0; j<9; ++j){

				System.out.println(arg1[i] + "x" + arg2[j] + "=" + arg1[i]*arg2[j] );
			}
		}
	}
}