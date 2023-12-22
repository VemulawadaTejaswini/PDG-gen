class Main {
    public static void main(String[] args) {
    	int[] x = {1,2,3,4,5,6,7,8,9},y = {1,2,3,4,5,6,7,8,9};
    	
    	for(int i=0; i<9; i++) {
    		for(int j=0; j<9; j++) {
    			int ans = x[i] * y[j];
    			System.out.println(x[i] + "x" + y[j] + "=" + ans);
    		}
    	}
    }
}