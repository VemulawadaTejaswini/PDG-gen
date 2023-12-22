import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    double[] out = new double[10];
	    out[0] = s.nextDouble();
	    double sum = out[0];
	    for(int i=1 ; i<10 ; i++) {
		if((i+1)%2==0) {
		    out[i] = out[i-1]*2;
		} else {
		    out[i] = out[i-1]/3;
		}
		sum+=out[i];
	    }
	    System.out.println(sum);
	}
    }
}