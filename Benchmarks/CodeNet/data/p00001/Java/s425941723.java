class Main{
    public static void main(String[] a){
    	int max = 0, max2 = 0, max3 = 0;
    	int[] x = new int[a.length];
    	int m = 1;
		for(int i = 0; i < a.length; i++){
			x[i] = Integer.parseInt(a[i]);
		}

		for (int i =0; i < x.length; i++) {
			if (i == 0) {
				max = x[0];		
			} else {
				if (max <= x[i]){
					max = x[i];
				}
			}
		}

		for (int i =0; i < x.length; i++) {
			if (i == 0) {
				if (x[0] == max) {

				}else {
					max2 = x[0];
				}
			} else {
				if (max2 <= x[i]){
					if (x[i] == max) {

					} else {
						max2 = x[i];
					}
				}
			}
		}

		for (int i =0; i < x.length; i++) {
			if (i == 0) {
				if (x[0] == max) {
					
				} else {
					max3 = x[0];
				}
			} else {
				if (max <= x[i]){
					if (x[i] == max) {
					} else {
						max3 = x[i];
					}
				}
			}
		}
    	System.out.println(max);
    	System.out.println(max2);
    	System.out.println(max3);
   }
}