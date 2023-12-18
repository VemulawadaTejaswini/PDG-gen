import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    int n;
    char[][] x;
    boolean[] usedArphabet;
    boolean[] noZero;
    boolean flag;
    int[] number;
    long ans;
    
    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    
	    flag = false;
	    x = new char[n][];
	    for(int i=0; i<n; i++)
		x[i] = sc.next().toCharArray();
	   
	    search();
	    if(flag) continue;

	    ans = 0;
	    number = new int[26];
	    Arrays.fill(number, -1);
	    solve(0);
	    System.out.println(ans);
	}
    }

    void solve(int p){
	if(p==26){
	    int y = 0;
	    int keta;
	    for(int i=0; i<n-1; i++){
		keta = 1;
		for(int k=x[i].length-1; k>=0; k--){
		    y += number[x[i][k]-65]*keta;
		    keta *= 10;
		}
	    }
	    int tmp = 0;
	    keta = 1;
	    for(int k=x[n-1].length-1; k>=0; k--){
		tmp += number[x[n-1][k]-65]*keta;
		keta *= 10;
	    }
	    if(y==tmp) {
		//show();
		ans++;
	    }
	    return;
	}

	if(usedArphabet[p]){
	    int i = 0;
	    if(noZero[p]) i = 1;
	    for(; i<=9; i++){
		boolean notBad = true;
		for(int k=0; k<p; k++){
		    if(number[k]==-1) continue;
		    if(number[k]==i) notBad = false;
		}

		if(notBad){
		    number[p] = i;
		    solve(p+1);
		}
	    }
	}
	else solve(p+1);
    }

    void search(){
	usedArphabet = new boolean[26]; // 0=A, 25=Z
	noZero = new boolean[26];
	int maxlength = 0;
	for(int i=0; i<n; i++){
	    maxlength = Math.max(maxlength, x[i].length);
	    for(int k=0; k<x[i].length; k++){
		int c = x[i][k] - 65;
		//System.out.println(x[i][k]+" "+c);
		usedArphabet[c] = true;
		if(k==0 && x[i].length!=1) noZero[c] = true;
	    }
	}

	if(maxlength > x[n-1].length){
	    badCase();
	    return;
	}
    }

    void badCase(){
	System.out.println(0);
	flag = true;
    }

    void show(){
	for(int i=0; i<number.length; i++)
	    System.out.print(number[i]+" ");
	System.out.println();
    }
}