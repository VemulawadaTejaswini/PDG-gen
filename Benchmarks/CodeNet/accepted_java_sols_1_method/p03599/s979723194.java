public class Main {
	 public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();
		    int d = scanner.nextInt();
		    int e = scanner.nextInt();
		    int f = scanner.nextInt();
		    
		    int a1 = 0;
		    int b1 = 0;
		    
		    double maxnoudo = 0;
		    int maxtotal = 100 * a;
		    int maxsatou = 0;
		    double limitnoudo = (double) (e * 100) / (double) (100 + e);
		    
		    while(true) {
		    	b1 = 0;
		    	if (100 * a * a1 > f) {
		    		break;
		    	}
		    	while(true) {
			    	int c1 = 0;
			    	int d1 = 0;
				    int mizu = 100 * ( a * a1 + b * b1);
				    if (mizu + c> f) {
				    	break;
				    }
				    while (true) {
				    	d1 = 0;
				    	if (mizu + c * c1 > f) {
				    		break;
				    	}
				    	while (true) {
						    int satou = c * c1 + d * d1;
						    int total = mizu + satou;
						    if (total > f) {
						    	break;
						    }
		//				    if ((satou * 100) > (e * mizu)) {
		//				    	break;
		//				    }
						    double noudo = (double) (satou * 100) / (double) total;
						    if (noudo > limitnoudo) {
						    	break;
						    }
						    if (noudo > maxnoudo) {
						    	maxnoudo = noudo;
						    	maxtotal = total;
						    	maxsatou = satou;
						    }
//						    if (c1 > d1) { c1--; d1++; } else { c1++; }
						    d1++;
				    	}
				    	c1++;
				    }
				    b1++;
	//			    if (a1 > b1) { a1--; b1++; } else { a1++; }
		 		}
		    	a1++;
		    }
		    System.out.println(maxtotal + " " + maxsatou);
		 }


}
