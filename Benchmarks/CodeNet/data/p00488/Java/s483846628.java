import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

	solve();
    }

    static void solve(){
	int p = kbd.nextInt();
	for(int i=2; i>0; i--){
	    int pp = kbd.nextInt();
	    if(p>pp) p=pp;
	}

	int j = kbd.nextInt();
	int j2 = kbd.nextInt();
	if(j>j2) j=j2;


	System.out.println(j+p-50);
    }
}