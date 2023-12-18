import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	String ans = solve();
	System.out.println(ans);
    }

    String solve(){
	String ans = "A";
	while(sc.hasNext()){
	    String s = sc.next();
	    String[] b = s.split(",");
	    if(ans.equals(b[0])) ans = b[0];
	    else if(ans.equals(b[1])) ans = b[1];
	}
	return ans;
    }
}