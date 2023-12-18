import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int keta = kbd.nextInt();
	    if(! (n==0 && keta==0))
		solve(n, keta);
	}
    }
    
    //20回計算して、上から調べる
    static void solve(int n, int keta){
	int[] m = new int[20];
	int[] min = new int[keta];
	String ss;
	int mMax, mMin, i, j;
	int[] p = {100, 100, 100};

	m[0] = n;
	for(i=0; i<19; i++){
	    //System.out.println(m[i]);
	    putKeta(m[i], min);
	    sort(min);
	    ss = "";
	    for(j=0; j<keta; j++){
		ss += min[j];
	    }
	    mMin = Integer.parseInt(ss);
	    ss = "";
	    for(j=keta-1; j>=0; j--){
		ss += min[j];
	    }
	    mMax = Integer.parseInt(ss);

	    m[i+1] = mMax-mMin;
	}

	//i>j
	for(i=m.length-1; i>=0; i--){
	    for(j=i-1; j>=0; j--){
		//System.out.println(i+" "+j+" *"+m[i]+" "+m[j]);
		if(m[i]==m[j] && j<p[0] && (i-j)<=p[2]){
		    p[0] = j;
		    p[1] = m[i];
		    p[2] = i-j;
		}
	    }
	}

	System.out.println(p[0]+" "+p[1]+" "+p[2]);
    }

    static void putKeta(int n, int[] min){
	int keta = min.length;  //現在の桁
	int i, a;
	while(keta>0){
	    a = 1;
	    for(i=1; i<keta; i++) a = a*10;
	    min[keta-1] = (n/a)%10;
	    keta--;
	    //System.out.println(min[keta]);
	}
    }

    static void sort(int[] min){
	int i, j;
	for(i=0; i<min.length; i++){
	    for(j=i; j<min.length; j++){
		if(min[i] > min[j]){
		    int w = min[i];
		    min[i] = min[j];
		    min[j] = w;
		}
	    }
	}
    }
}