import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);

    void run(){
	while(kbd.hasNext()){
	    String a = kbd.next();
	    String b = kbd.next();
	    if(!a.equals("0")) solve(a, b);
	}
    }

    void solve(String a, String b){
	int hit = 0;
	int blow = 0;
	int[] aa = new int[4];
	int[] bb = new int[4];
	for(int i=0; i<4; i++){
	    aa[i] = Integer.parseInt(a.substring(i, i+1));
	    bb[i] = Integer.parseInt(b.substring(i, i+1));
	}
	for(int i=0; i<4; i++){
	    for(int j=0; j<4; j++){
		if(aa[i]==bb[j]){
		    if(i==j) hit++;
		    else  blow++;
		}
	    }
	}
	System.out.println(hit+" "+blow);
    }
}