import java.util.*;

class Main{

    String lefts="qwertasdfgzxcvb";
    String rights="yuiophjklnm";

    void solve(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    String s=sc.next();
	    if(s.equals("#"))break;
	    boolean lr=true;
	    int count=0;
	    String c="";c+=s.charAt(0);
	    if(lefts.contains(c))lr=true;
	    else lr=false;

	    for(int i=1;i<s.length();i++){
		c="";c+=s.charAt(i);
		boolean z=lefts.contains(c);
		if(lr && !z){count++;lr=false;}
		else if(!lr && z){count++;lr=true;}

	    }
	    System.out.println(count);
	}
    }
    public static void main(String[] args){
	new Main().solve();
    }
}