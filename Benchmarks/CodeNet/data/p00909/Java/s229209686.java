import java.util.Scanner;
 
public class Main {
    public static int N;
    public static int M;
    public static int[] p;
    public static int[] rank;
    public static int[] weight;

    public static boolean same(int x, int y) {
        return findSet(x) == findSet(y);
    }
 
    public static void unite(int x, int y, int w) {
        int i = findSet(x);
        int j = findSet(y);
        w -= weight[j] - weight[i];

        if (i == j){
	    return;
	}
        if (rank[i] > rank[j]){
            p[j] = p[i];
            weight[j] = w;
        } else {
            p[i] = p[j];
            weight[i] = -w;
            if(rank[i] == rank[j]){
		rank[j]++;
            }
        }	
    }
 
    public static int findSet(int i) {
	if(p[i] == i){ 
	    return i;
        }else{
	    return p[i] = findSet(p[i]);
        }
    }
 
    public static void DisjointSet() {
        p = new int[N];
        rank = new int[N];
        weight = new int[N];
 
        for (int i = 0; i < N; i++) {
            p[i] = i;
            rank[i] = 0;
            weight[i] = 0;
        }
    }
 
 
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
	    N = scanner.nextInt();
	    M = scanner.nextInt();

	    if(N==0 |M==0){
		break;
	    }
 
	    DisjointSet();

	    for (int i = 0; i < M; i++) {       
		if(scanner.next().equals("!")){
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int w = scanner.nextInt();
 
		    a--; b--;   
		    unite(a, b, w);
		}else{ 
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
                    a--; b--;
		    if(same(a,b)){
			System.out.println(weight[b] - weight[a]);
		    }else{
			System.out.println("UNKNOWN");
		    }
		}
	    }
	}
      
    }
}