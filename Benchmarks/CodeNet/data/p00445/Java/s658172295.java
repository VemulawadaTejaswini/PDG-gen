import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);

    String s;

    void run(){
	while(kbd.hasNext()){
	    s = kbd.next();
	    solve();
	}
    }

    void solve(){
	int i, j;
	int ansJ=0;
	int ansI = 0;
	for(i=0; i<s.length()-2; i++){
	    String a = s.substring(i, i+3);
	    //System.out.println(a);
	    if(a.equals("JOI"))
		ansJ++;
	    if(a.equals("IOI"))
		ansI++;
	}
	
	System.out.println(ansJ);
	System.out.println(ansI);
    }
}