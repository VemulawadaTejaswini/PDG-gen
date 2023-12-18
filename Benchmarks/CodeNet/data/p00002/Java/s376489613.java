class main {

    public static void main(int[][] args)
    {
       if (args.length > 200) {
           System.out.printf("Input dataset number should not be over 200!\n");
       }
       for (int[] ds : args) {
		   if (ds.length != 2 ||
			   (ds[0] < 0 || ds[0] > 1000000) ||
			   (ds[1] < 0 || ds[1] > 1000000)) {
		       System.out.printf("Each dataset should be consist of 2 numbers between 0 and 1000000!\n");
		   }
       }
       for (int[] ds : args) {
    	   int num = ds[0] + ds[1];
    	   int len = (int)(Math.log10(num) + 1);
    	   System.out.printf("%d\n", len);
       }
    }
}