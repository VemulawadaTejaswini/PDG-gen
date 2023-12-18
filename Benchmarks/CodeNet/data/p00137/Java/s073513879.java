import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, cs, s;
    final int keta = 4;

    void run(){
	cs = 1;
	n = sc.nextInt();
	while(n>0){
	    s = sc.nextInt();
	    solve();
	    cs++;
	    n--;
	}
    }

    void solve(){
	System.out.println("Case "+cs+":");
	for(int i=0; i<10; i++){
	    s = s*s;
	    s = (s%1000000)/100;
	    System.out.println(s);
	}
    }
}