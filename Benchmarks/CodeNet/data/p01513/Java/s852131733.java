import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int i, k, m, x;
		boolean[][] p = new boolean[n+1][n+1];
		for(i=1; i<=n; i++){
		    m = kbd.nextInt();
		    //p[i][i] = true;
		    while(m>0){ 
			x = kbd.nextInt();
			p[i][x] = true;
			m--;
		    }
		}
		k = kbd.nextInt();
		while(k>0){
		    x = kbd.nextInt();
		    p[0][x] = true;
		    k--;
		}
		
		int a = 0;
		int b = n;
		while(b>0){
		    a = judge(p, n, a, b);
		    b--;
		    //System.out.println(a);
		}
		if(a<=0)
		    System.out.println("-1");
		else 
		    System.out.println(a);
	    }
	}
    }

    public static int judge(boolean[][] p, int n, int a, int b){
	boolean u = true;
	int i;
	for(i=1; i<=n; i++){
	    if(p[0][i]) {
		u = u && (p[0][i]&&p[b][i]);
		//System.out.println(p[0][i]+" "+p[b][i]);
	    }
	    else {
		//System.out.println(p[0][i]+" "+p[b][i]);
		;
	    }
	}
	//System.out.println(b+" "+a+" "+u);
	if(a==0){
	    if(u) return b;  //n番の人が初めて合致した
	    else return 0;   //まだ見つからない
	}
	else {
	    if(u) return -1;
	    else return a; 
	}
    }
}