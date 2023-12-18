import java.io.*;
import java.util.*;

class Main{
    static int n, s, count;
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

	try {
	    String st;
	    int[] used = new int[10];
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(" ");
		n = Integer.valueOf(sp[0]);
		s = Integer.valueOf(sp[1]);
		for(int i=0; i<10; i++)
		    used[i] = i;
		count = 0;
		solve(1,0,used);
		System.out.println(count);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    static void solve(int k, int now, int[] used){
	if(now>s) return;
	if(k==n+1 && now==s){
	    count++;
	    return;
	}
	for(int i=0; i<10; i++){
	    if(used[i]!=-1){
		int t = used[i];
		used[i] = -1;
		now+=k*t;
		solve(k+1,now,used);
		now-=k*t;
		used[i]=t;
	    }
	}
    }
}