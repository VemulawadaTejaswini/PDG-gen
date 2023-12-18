import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n);
	}
    }

    static void solve(int n){
	int[][] f = new int[n][n];
	int x, y;
	x = n/2+1;
	y = n/2;
	f[x][y] = 1;
	//テ」ツつケテ」ツつソテ」ツδシテ」ツδ暗・ツ慊ーテァツつケテ」ツ?ェテ」ツ??

	x = x+1;
	y = y+1;

	int i=2;
	while(i<=n*n){
	    //System.out.println(x+" "+y);
	    if(check(x, y, n)&&empty(x, y, f)){
		f[x][y] = i;
		i++;
		x += 1;
		y += 1;
	    }
	    else{
		if(x<0) x = n-1;
		else if(x>=n) x = 0;
		if(y>=n) y = 0;
		else if(y<0) y = n-1;
     		if(!empty(x, y, f)){
		    x += 1;
		    y -= 1;
		}
	    }
	}

	int a, b;
	for(a=0; a<n; a++){
	    for(b=0; b<n; b++){
		System.out.printf("%4d",f[a][b]);
	    }
	    System.out.println();
	}
    }

    static boolean check(int x, int y, int n){
	boolean a = x<n && x>=0;
	boolean b = y<n && y>=0;
	return a&&b;
    }

    static boolean empty(int x, int y, int[][] f){
	return f[x][y]==0;
    }
}