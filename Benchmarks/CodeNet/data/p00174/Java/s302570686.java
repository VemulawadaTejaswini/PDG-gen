import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    String s;
    int a, b;

    void run(){
	while(sc.hasNext()){
	    s = sc.next();
	    solve();
	}
    }

    void solve(){
	//System.out.println(a+" "+b+" "+s);
	String ss = s.substring(0, 1);
	if(!(a==0 && b==0)){
	    if(ss.equals("A")) a++;
	    else if(ss.equals("B")) b++;
	    else {
		if(a>b) a++;
		else b++;
	    }
	    System.out.println(a+" "+b);
	    a = 0;
	    b = 0;
	}
	/* "0" が来た時ここでプログラム終了 */
	for(int i=1; i<s.length(); i++){
	    ss = s.substring(i, i+1);
	    if(ss.equals("A")) a++;
	    else b++;
	}
    }
}