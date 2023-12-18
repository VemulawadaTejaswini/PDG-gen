class main {

    public static void main(int[] args)
    {
       if (args.length != 10) {
           System.out.format("Input data number should be 10!\n");
       }
       for (int i : args) {
	   if (i < 0 || i > 10000) {
	       System.out.format("Input data should be between 0 and 10000!\n");
	   }
       }
       int[] x = {-1};
       int idxMax = maximum(args, x);
       int[] y = {idxMax};
       int idxSnd = maximum(args, y);
       int[] z = {idxMax, idxSnd};
       maximum(args, z);
    }
    
    private static int maximum(int[] args, int[] idxIgnore)
    {
       int max = 0;
       int idx = 0;
       for(int i = 0; i < 10; i++) {
    	   for (int j =0 ; j < idxIgnore.length; j++) {
    	       if (i == idxIgnore[j]) continue;
    	   }
    	   if (args[i] > max ) {
 	          max = args[i];
 	          idx = i;
	       }
       }
       System.out.format("%d\n", max);
       return idx;
    }
}