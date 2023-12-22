import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    long[]x = new long[n];
    long[]y = new long[n];

    for(int i=0; i<n; i++) {
    	x[i] = sc.nextLong();
    	y[i] = sc.nextLong();
    }
    long cou = 0;
    long a = 0;
    for(int i=0; i<n; i++) {
    	a = x[i]*x[i]+y[i]*y[i] ;
    	if(a <= d*d) {
    		cou++;
    	}
    }
    	System.out.println(cou);
    }
}