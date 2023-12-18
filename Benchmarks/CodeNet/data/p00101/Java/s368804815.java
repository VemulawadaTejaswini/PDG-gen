import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = Integer.parseInt(kbd.nextLine());
	while(n>0){
	    solve();
	    n--;
	}
    }

    static void solve(){
	String s = kbd.nextLine();
	//System.out.println(s);
	String ans = "";
	String a="", x;
	int i=0;
	while(i<s.length()){
	    x = s.substring(i, i+1);
	    if(!x.matches("[a-zA-z]")){
		if(a.equals("Hoshino")) a="Hoshina";
		ans += a+x;
		a = "";
	    }
	    else {
		a += x;
		//System.out.println(a);
	    }
	    i++;
	}
	if(!a.equals("")){
	    if(a.equals("Hoshino")) a="Hoshina";
		ans += a;
	}

	System.out.println(ans);
    }
}