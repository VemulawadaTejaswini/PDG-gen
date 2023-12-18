import java.util.*;

public class Main{
    Main(){
	int n, s, t, u, v;
	Scanner sc = new Scanner(System.in);
	int[] score, rank;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    score = new int[n];
	    rank = new int[n];

	    for(int i = 0; i < (n*(n-1))/2; ++i){
		s = sc.nextInt();
		t = sc.nextInt();
		u = sc.nextInt();
		v = sc.nextInt();

		if(u == v) u = v = 1;
		else if(u < v){ u = 0; v = 3;} 
		else {u = 3; v = 0;}

		score[s-1] += u;
		score[t-1] += v;
	    }
	    s = 0;
	    for(int i = 0; i < n; ++i)
		s = Math.max(s, score[i]);

	    t = 1;
	    for(int i = s; i >= 0; --i){
		u = 0;
		for(int j = 0; j < n; ++j)
		    if(score[j] == i){
			rank[j] = t;
			++u;
		    }
		t += u;
	    }

	    for(int i = 0; i < n; ++i)
		System.out.printf("%d\n", rank[i]);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}