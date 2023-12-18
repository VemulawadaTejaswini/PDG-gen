import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    char[][] map;
    char[][] round; // "":テヲツ慊ェ, B:テゥツサツ? W:テァツ卍ス, x:テゥツサツ津」ツ?ァテ」ツつづァツ卍ステ」ツ?ァテ」ツつづ」ツ?ェテ」ツ??n:テヲツ敖ュ
    int w, h;
    int B, W;


    void run(){
	while(sc.hasNext()){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0) break;
	    
	    map = new char[h][w];
	    round = new char[h][w];
	    
	    for(int i=0; i<h; i++){
		String s = sc.next();
		Arrays.fill(round[i], 'o');
		for(int k=0; k<w; k++)
		    map[i] = s.toCharArray();
	    }
	    
	    for(int i=0; i<h; i++)
		for(int k=0; k<w; k++){
		    solve(i, k, map[i][k]);
		}
	    
	    count();
	    //show();
	    System.out.println(B+" "+W);
	}
    }

    void solve(int a, int b, char c){
	if(a<0 || a>=h || b<0 || b>=w) return;
	if(round[a][b]=='x' || round[a][b]=='n' || c=='.') return;
	
	if(map[a][b]=='B' || map[a][b]=='W'){
	    c = map[a][b];
	    round[a][b] = 'n';
	    solve(a+1, b, c);
	    solve(a-1, b, c);
	    solve(a, b+1, c);
	    solve(a, b-1, c);
	}
	else if(round[a][b]=='o'){
	    round[a][b] = c;
	    solve(a+1, b, c);
	    solve(a-1, b, c);
	    solve(a, b+1, c);
	    solve(a, b-1, c);
	}
	else if( (round[a][b]=='B' && c=='W') || (round[a][b]=='W' && c=='B')){
	    round[a][b] = 'x';
	    solve(a+1, b, c);
	    solve(a-1, b, c);
	    solve(a, b+1, c);
	    solve(a, b-1, c);
	}
    }

    void count(){
	B = 0;
	W = 0;
	for(int i=0; i<h; i++)
	    for(int k=0; k<w; k++)
		if(round[i][k]=='B') B++;
		else if(round[i][k]=='W') W++;
    }

    void show(){
	for(int i=0; i<h; i++){
	    for(int k=0; k<w; k++)
		System.out.print(round[i][k]+" ");
	    System.out.println();
	}
	System.out.println("-------------------");
    }
}