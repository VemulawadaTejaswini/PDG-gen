import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int[] p = new int[10001];
	setP(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(p, n);
	}
    }

    static void solve(int[] p, int n){
	int sum=0, i;
	for(i=0; p[i]<=n; i++){
	    if(p[i]!=-1) {
		sum+=i;
		//System.out.println(i);
	    }
	}

	System.out.println(sum);
    }

    static void setP(int[] p){
	int a=1, i, j;
	Arrays.fill(p, 1);
	p[0] = -1;
	p[1] = -1;
	for(i=2; i<p.length; i++){
	    if(p[i] == 1){
		//System.out.println(i+" "+a);
		p[i] = a;
		a++;	
	    }
	    for(j=i+i; j<p.length; j+=i){
		p[j] = -1;
	    }
	}
    }
}