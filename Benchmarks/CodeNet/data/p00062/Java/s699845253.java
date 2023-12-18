import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
  
    int[][] num = new int[10][10]; // [横][縦]  
    void run(){
	while(sc.hasNext()){
	    String a = sc.next();
	    for(int i=0; i<a.length(); i++){
		String b = a.substring(i, i+1);
		num[0][i] = Integer.parseInt(b);
		//System.out.print(num[0][i]+" ");
	    }
	    //System.out.println();
	    solve();
	}
    }

    void solve(){
	for(int i=1; i<10; i++){ // i=縦
	    for(int j=0; j<10-i; j++){ // j=横
		num[i][j] = (num[i-1][j]+num[i-1][j+1])%10;
		//System.out.print(num[i][j]+" ");
	    }
	    //System.out.println();
	}
	System.out.println(num[9][0]);
    }
}