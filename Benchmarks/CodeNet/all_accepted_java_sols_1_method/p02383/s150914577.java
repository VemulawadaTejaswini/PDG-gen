import java.util.Scanner;
 
class Main {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int[] x = new int[7];
        	for(int i = 1; i < 7; i++) {
            		x[i] = sc.nextInt();
        	}

        	char[] y = sc.next().toCharArray();
        	for(int i = 0; i < y.length; i++) {
            		if (y[i] == 'N') {
                		x[0] = x[1];
                		x[1] = x[2];
                		x[2] = x[6];
                		x[6] = x[5];
                		x[5] = x[0];
            		}else if (y[i] == 'S') {
                		x[0] = x[1];
                		x[1] = x[5];
                		x[5] = x[6];
               	 		x[6] = x[2];
                		x[2] = x[0];
            		}else if (y[i] == 'E') {
		                x[0] = x[1];
		                x[1] = x[4];
		                x[4] = x[6];
		                x[6] = x[3];
		                x[3] = x[0];
            		}else {
		                x[0] = x[1];
		                x[1] = x[3];
		                x[3] = x[6];
		                x[6] = x[4];
		                x[4] = x[0];
            		}
        	}
        	System.out.println(x[1]);
    	}
}