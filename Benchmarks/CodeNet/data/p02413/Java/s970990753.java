import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[][] cell;
    int h, w;
    int i, j;
    
    void run(){
	while(sc.hasNext()){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(h!=0 && w!=0){
		cell = new int[h+1][w+1];
		solve();
	    }
	}
    }

    void solve(){
	for(i=0; i<h; i++){
	    for(j=0; j<w; j++){
		cell[i][j] = sc.nextInt();
		cell[h][j] += cell[i][j];
		cell[i][w] += cell[i][j];
		cell[h][w] += cell[i][j];
	    }
	}
	print();
    }

    void print(){
	for(i=0; i<=h; i++){
	    for(j=0; j<=w; j++){
		System.out.print(cell[i][j]);
		if(j+1<=w)
		    System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}