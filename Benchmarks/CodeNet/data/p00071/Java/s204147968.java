import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, x, y, c;
    String s;
    int[][] map;

    void run(){
	n = sc.nextInt();
	c = 1;
	while(c<=n){
	    System.out.println("Data "+c+":");
	    c++;

	    map = new int[9][9];
	    for(int i=1; i<=8; i++){
		s = sc.next();
		for(int k=1; k<=s.length(); k++)
		    map[i][k] = Integer.parseInt(s.substring(k-1, k));
	    }

	    //show();
	    //System.out.println("--------");

	    x = sc.nextInt();
	    y = sc.nextInt();
	    
	    solve(y, x);
	    show();
	}
    }

    void solve(int y, int x){
	map[y][x] = 0;
	for(int a=x-3; a<=x+3; a++)
	    if(a>=1 && a<=8 && map[y][a]==1)
		solve(y, a);
	for(int b=y-3; b<=y+3; b++)
	    if(b>=1 && b<=8 && map[b][x]==1)
		solve(b, x);
    }

    void show(){
	for(int i=1; i<=8; i++){
	    for(int k=1; k<=8; k++)
		System.out.print(map[i][k]);
	    System.out.println();
	}
    }
}