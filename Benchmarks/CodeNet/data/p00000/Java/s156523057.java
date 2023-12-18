public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[]{1,2,3,4,5,6,7,8,9} ;
		int[] y = new int[]{1,2,3,4,5,6,7,8,9} ;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.println(x[i] + "x" + y[j] + "=" + (x[i]*y[j]));
			}
		}	
	}
}

