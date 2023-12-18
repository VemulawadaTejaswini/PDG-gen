import java.io.*;
import java.util.*;

class Main{
    static int num=0, n;
    static int[] box;
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    n = Integer.valueOf(sc.readLine());
	    String inp = sc.readLine();
	    int m = Integer.valueOf(sc.readLine());
	    String[] st = sc.readLine().split(" ");
	    box = new int[m];
	    for(int i=0; i<m; i++)
		box[i] = Integer.valueOf(st[i]);
	    int start = -1;
	    for(int i=0; i<n; i++)
		if(inp.charAt(i)=='*'){
		    start = i;
		    break;
		}
	    int[] tmp = new int[n];
	    for(int i=0; i<n; i++)
		if(inp.charAt(i)=='*')
		    tmp[i] = -1;
		else
		    tmp[i] = (int)(inp.charAt(i)-'0');
	    solve(tmp,start);
	    System.out.println(num);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    static void solve(int[] tmp, int start){
	if(start == -1){
	    int ap = 0;
	    if(n%2==1){
		ap+=tmp[0];
		for(int i=1; i<n; i+=2){
		    int t = 2*tmp[i];
		    if(t>=10)
			t = t/10+t%10;
		    ap+=t+tmp[i+1];
		}
	    }
	    else
		for(int i=0; i<n; i+=2)
		    ap+=2*tmp[i]+tmp[i+1];
	    if(ap%10==0)
		num++;
	    return;
	}
	int zz = start;
	for(int u: box){
	    tmp[zz] = u;
	    boolean flag = false;
	    for(int i=zz; i<n; i++)
		if(tmp[i]==-1){
		    start = i;
		    flag = true;
		    break;
		}
	    if(!flag)
		start = -1;
	    solve(tmp,start);
	    tmp[zz]=-1;
	}
    }
}