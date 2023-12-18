import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		solve(n);
	    }
	}
    }

    static void solve(int n){
        String[][] group = new String[n][1000000];
	int i, j, k=0, g=0;
	String a, p;
	while(g<n){
	    String len = kbd.next();
	    p = "";
	    for(i=0; i<len.length(); i++){
		a = len.substring(i, i+1);
		if(a.equals(":") || a.equals(",") || a.equals(".")){
		    group[g][k++] = p;
		    p = "";
		}
		else {
		    p += a;
		}
	    }
	    k=0;
	    g++;
	}

	int cnt = 0;
	String[] men = new String[1000000];
	boolean TF = true;
	boolean[] x = new boolean[n];
	Arrays.fill(x, false);
	x[0] = true;
    

	for(g=0; g<n; g++){
	    for(i=1; group[g][i] != null; i++){
		p = group[g][i];
		//System.out.println(p);

		for(j=0; j<n; j++){
		    if(x[g] && group[j][0].equals(p)){
			//System.out.println(p);
			x[j] = true;
		    }
		}
	    }
	}


	for(g=0; g<n; g++){
	    for(i=1; group[g][i] != null; i++){
		TF = true;
		p = group[g][i];
		//System.out.println(p);

		for(j=0; j<n; j++){
		    if(x[g] && group[j][0].equals(p)){
			//System.out.println(p);
			TF = false;
			x[j] = true;
		    }
		    else if(group[j][0].equals(p)){
			//System.out.println(p);
			TF = false;
		    }
		}

		for(j=0; men[j]!=null; j++){
		    if(men[j].equals(p)){
			//System.out.println(p);
			TF = false;
		    }
		}

		if(TF && x[g]){
		    //System.out.println(p);
		    men[cnt] = p;
		    cnt++;
		    TF = true;
		}
		TF = true;
	    }
	}

	System.out.println(cnt);
    }
}