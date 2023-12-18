import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve2440();
	}

	public static void solve2440() {
		Scanner sc = new Scanner(System.in);
		while(true){
            double n = sc.nextInt();
            if(n==0) {
            	break;
            }
    		int cnt = 0;
    		for(int i=2;i>0;i++) {
        		int a = 0;
        		double x = n/i;
	            if(x<1.5) {
	            	System.out.println(cnt);
	            	break;
	            }
	            for(int j=0 ;j<i;j++) {
	            	a+=n/i+j;
	            	if(n==a) {
	            		cnt++;
	            		break;
	            	}
	            	else if(n<a) {
	            		break;
	            	}
	            }
    		}
        }
	}
}
