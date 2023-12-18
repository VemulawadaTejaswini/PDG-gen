import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int change, u100, u500, u1000;

    void run(){
	while(sc.hasNext()){
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    if(!(a==0 && b==0)){
		change = b-a;
		u100 = 0;
		u500 = 0;
		u1000 = 0;
		solve();
	    }
	}
    }

    void solve(){
	while(change>=1000){
	    u1000++;
	    change -= 1000;
	}
	while(change>=500){
	    u500++;
	    change -= 500;
	}
	u100 = change/100;
	System.out.println(u100+" "+u500+" "+u1000);
    }
}
		    