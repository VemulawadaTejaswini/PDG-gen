import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    long n;
    int count;
    long lg = 2000000000;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextLong();
	    if(n!=0) solve();
	}
    }

    void solve(){
	count = 0;
	long fac = 1;
	while(n>0){
	    long a = n;
	    while(a%10 == 0){
		a = a/10;
		count++;
		//System.out.println(a+"**"+count);
	    }
	    fac = fac*(a%lg);
	    while(fac%10==0){
		fac = fac/10;
		count++;
	    }
	    fac = fac%lg;
	    //System.out.println(fac+" "+count);
	    n--;
	}
	
	System.out.println(count);
    }
}