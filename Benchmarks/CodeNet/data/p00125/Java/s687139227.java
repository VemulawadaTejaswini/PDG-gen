import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] mt = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean uru1, uru2;
    int y1, m1, d1, y2, m2, d2;
    int ans;

    void run(){
	while(sc.hasNext()){
	    y1 = sc.nextInt();
	    m1 = sc.nextInt();
	    d1 = sc.nextInt();
	    y2 = sc.nextInt();
	    m2 = sc.nextInt();
	    d2 = sc.nextInt();
	    if(y1>0 && m1>0 && d1>0 && y2>0 && m2>0 && d2>0){
		uru1 = uru(y1);
		if(uru1) mt[2] = 29;
		else mt[2] = 28;
		ans = 0;
		solve();
	    }
	}
    }

    void solve(){
	while(y1!=y2 || m1!=m2 || d1!=d2){	   
	    ans++;
	    d1++;
	    if(d1 > mt[m1]){
		d1 = 1;
		m1++;
		if(m1 > 12){
		    m1 = 1;
		    y1++;
		    uru1 = uru(y1);
		    if(uru1) mt[2] = 29;
		    else mt[2] = 28;   
		    //System.out.println(y1+" "+mt[2]);
		}
	    }
	}
	System.out.println(ans);
    }

    boolean uru(int y){
	if(y%4==0){
	    if(y%100==0){
		if(y%400==0) 
		    return true;
		return false;
	    }
	    return true;
	}
	return false;
    }
}