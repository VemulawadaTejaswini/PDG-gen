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
	while(q>0){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    wksg[a] += b;
	    q--;

	    int maxP = 0;
	    int maxW = 0;
	    for(int i=0; i<wksg.length; i++){
		// 番号が小さい順だから、ワカサギの数のみで判断すればおk
		if(wksg[i] > maxW){
		    maxP = i;
		    maxW = wksg[i];
		}   
	    }
	    System.out.println(maxP+" "+maxW);
	}
    }
}