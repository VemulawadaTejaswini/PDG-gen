import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    String ans;
    int f;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();

	    f = 1;
	    while(n>=f) f*=4;
	    ans = "";
	    int a = 0;

	    while(f>0){
		if(n>=f){
		    n -= f;
		    a++;
		}
		else{
		    ans += a;
		    a = 0;
		    f /= 4;
		}
	    }

	    System.out.println
		(ans.substring(0, 1).equals("0") && ans.length()!=1 ? 
			       ans.substring(1, ans.length()) : ans);
	}
    }
}