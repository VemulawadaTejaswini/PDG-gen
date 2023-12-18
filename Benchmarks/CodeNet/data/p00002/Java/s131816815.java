class main {

    public static void main(int[][] args)
    {
       if (args.length > 200) {
           System.out.format("Input data set number should not be over 200!\n");
       }
       for (int[] data: args) {
		   if (data.length != 2 ||
			   (data[0] < 0 || data[0] > 1000000) ||
			   (data[1] < 0 || data[1] > 1000000)) {
		       System.out.format("Each data set should be consist of 2 numbers between 0 and 1000000!\n");
		   }
       }
       for (int[] data: args) {
    	   int n = data[0] + data[1];
    	   int size = (int)(java.lang.Math.log10(n) + 1);
    	   System.out.format("%d\n", size);
       }
    }
}