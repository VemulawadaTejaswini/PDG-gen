import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, t;
    int[][] island;
    boolean ans;

    void run(){
	while(true){
	    n = sc.nextInt();
	    if(n==0) break;

	    island = new int[n][2];
	    for(int i=0; i<n; i++){
		island[i][0] = sc.nextInt();
		island[i][1] = sc.nextInt();
	    }

	    Arrays.sort(island, new Comparator<int[]>(){
		    public int compare(int[] a, int[] b){
			int x1 = a[1];
			int x2 = b[1];
			if(x1!=x2) return x1-x2;
			else return a[0]-b[0];
		    }
		}
		);

	    t = 0;
	    ans = true;
	    for(int i=0; i<n; i++){
		t += island[i][0];
		if(t>island[i][1]){
		    ans = false;
		    break;
		}
	    }

	    System.out.println(ans ? "Yes" : "No");
	}
    }
}