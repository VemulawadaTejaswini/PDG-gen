import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			solve();
	}

	public static void solve() { 
		long a = sc.nextInt();
      	long b = sc.nextInt();
      	long c = sc.nextInt();
      	long d = sc.nextInt();
		if( a>=0 && c>=0 ) {
			System.out.println(b*d);
          	return;
        }
         else  if(  b<0 && d<0 ) {
			System.out.println(a*c);
          	return;
        }
        else if(a>=0 && d<0){
          	System.out.println(a*d);
          	return;
        }
		else if(a<0 && d>=0){
          	System.out.println(b*c);
          	return;
        }
        
      
	}
}