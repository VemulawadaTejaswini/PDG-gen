import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }
    
    static void solve(){
	int i, j;
	int[] a = new int[4];
	for(i=0; i<4; i++){
	    a[i] = kbd.nextInt();
	}
	int[] b = new int[4];
	for(i=0; i<4; i++){
	    b[i] = kbd.nextInt();
	}

	int hit = 0, blow = 0;
	for(i=0; i<4; i++){
	    for(j=0; j<4; j++){
		if(a[i]==b[j] && i==j){
		    hit++;
		}
		else if(a[i]==b[j] && i!=j){
		    blow++;
		}
	    }
	}
	System.out.println(hit+" "+blow);
    }

}