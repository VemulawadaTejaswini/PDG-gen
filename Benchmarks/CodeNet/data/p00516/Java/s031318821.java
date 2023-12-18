import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, m;
    int[] N;
    int[] M;
    int[] get;
    int max, ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    N = new int[n];
	    M = new int[m];
	    get = new int[n];
	    max = 0;
	    ans = 0;

	    for(int i=0; i<n; i++)
		N[i] = sc.nextInt();
	    for(int i=0; i<m; i++)
		M[i] = sc.nextInt();

	    for(int i=0; i<m; i++){
		int k=0;		
		while(N[k]>M[i])k++;
		get[k]++;
		if(get[k]>max){
		    max = get[k];
		    ans = k+1;
		}
	    }

	    System.out.println(ans);
	}
    }
}