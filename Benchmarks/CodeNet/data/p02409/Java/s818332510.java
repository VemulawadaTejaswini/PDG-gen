import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().solve();
    }
    Scanner sc = new Scanner(System.in);
    Buil[] buil;

    void solve(){
	buil = new Buil[4];
	for(int i=0; i<4; i++)
	    buil[i] = new Buil();
	int n = sc.nextInt();
	while(n>0){
	    n--;
	    int t = sc.nextInt()-1;
	    //System.out.println(t);
	    buil[t].add();
	}
	buil[0].show();
	for(int i=1; i<buil.length; i++){
	    System.out.println("####################");
	    buil[i].show();
	}
    }
    
    class Buil{
	int[][] rooms;
	Buil(){
	    rooms = new int[3][10];
	}
	
	void add(){
	    int f = sc.nextInt();
	    int r = sc.nextInt();
	    int v = sc.nextInt();
	    rooms[f-1][r-1] += v;
	    //System.out.println(f+" "+r+" "+v);
	}

	void show(){
	    for(int i=0; i<3; i++){
		for(int j=0; j<10; j++){
		    System.out.print(" "+rooms[i][j]);
		}
		System.out.println();
	    }
	}
    }
}
	    