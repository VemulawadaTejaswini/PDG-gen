
public class Main {
    public static void main(String[] args) {

	int cnt = 0;
	double out;
       
	int  n = new java.util.Scanner(System.in).nextInt();


	for(int i = n; i >= 1; i--) {
	    if(i % 2 != 0) {
		cnt++;
	
	    }
	}

	out = (double)cnt / (double)n;
	System.out.printf("%.8f", out);
    }
}