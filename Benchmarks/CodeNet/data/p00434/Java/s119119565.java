import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }

    static void solve(){
	boolean[] m = new boolean[31];
	int i;
	for(i=0; i<28; i++){
	    int x = kbd.nextInt();
	    m[x] = true;
	}
	for(i=1; i<m.length; i++){
	    if(!m[i])
		System.out.println(i);
	}
    }
}