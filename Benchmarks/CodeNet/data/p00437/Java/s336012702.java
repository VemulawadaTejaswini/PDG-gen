import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] parts;
    int[][] test;
    int n;

    void run(){
	while(sc.hasNext()){
	    int a = sc.nextInt() + sc.nextInt() + sc.nextInt();
	    if(a!=0){
		parts = new int[a+1];
		Arrays.fill(parts, 2);
		n = sc.nextInt();
		test = new int[4][n];
		solve();
	    }
	}
    }

    void solve(){
	for(int i=0; i<n; i++){
	    test[1][i] = sc.nextInt();
	    test[2][i] = sc.nextInt();
	    test[3][i] = sc.nextInt();
	    test[0][i] = sc.nextInt();
	    if(test[0][i]==1){
		for(int k=1; k<=3; k++)
		    parts[test[k][i]] = 1;
	    }
	}

	for(int i=0; i<n; i++){
	    if(test[0][i]==0){
		int tCount = 0;
		int fal = -1;
		for(int k=1; k<=3; k++)
		    if(parts[test[k][i]]==1)
			tCount++;
		    else fal = test[k][i];
		if(tCount==2 && fal!=-1)
		    parts[fal] = 0;
	    }
	}

	for(int i=1; i<parts.length; i++)
	    System.out.println(parts[i]);
    }
}