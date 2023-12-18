import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){

	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();

	    a += sc.nextInt();
	    b += sc.nextInt();
	    c += sc.nextInt();

	    if(a==0 && b==0 && c==0) break;

	    int sum = 0;
	    sum += a/3 + b/3 + c/3;
	    sum += Math.min(a%3,Math.min(b%3,c%3));

	    System.out.println(sum);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}