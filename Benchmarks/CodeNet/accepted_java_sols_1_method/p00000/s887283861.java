class Main{
	public static void main(String[] args){
	    int[] x = {1,2,3,4,5,6,7,8,9};
	    int[] y = {1,2,3,4,5,6,7,8,9};
	    for(int n=0;n<9;n++){
		    for(int m=0;m<9;m++){
			    int s = x[n]*y[m];
			    System.out.println(x[n]+"x"+y[m]+"="+s);
		    }
	    }
	}
}
