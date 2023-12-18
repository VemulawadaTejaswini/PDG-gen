import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	int n = kbd.nextInt();
	int q = kbd.nextInt();
	int[] wksg = new int[10000001];
	int maxP = 1;
	int maxW = 0;
	while(q>0){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    wksg[a] += b;
	    //System.out.println(a+" "+wksg[a]);
	    q--;
	 
	    if(wksg[a] > maxW){
		maxP = a;
		maxW = wksg[a];
	    }
	    else if(wksg[a]==maxW && a<maxP){
		maxP = a;
		maxW = wksg[a];
	    }

	    if(maxP==a && wksg[a]<maxW){
		maxW = wksg[a];
		for(int i=0; i<wksg.length; i++){
		    if(maxW < wksg[i]){
			maxP = i;
			maxW = wksg[i];
		    }
		    else if(maxW==wksg[i] && maxP>i){
			maxP = i;
			maxW = wksg[i];
		    }
		}
	    }
	    System.out.println(maxP+" "+maxW);
	}
    }
}