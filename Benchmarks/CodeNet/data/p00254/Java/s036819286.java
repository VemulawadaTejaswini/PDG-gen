import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int ans, c;
    String n;
    char[] num;

    void run(){
	while(true){
	    n = sc.next();
	    ans = Integer.parseInt(n);
	    c = 0;
	    num = n.toCharArray();
	    if(num[0]==num[1] && num[1]==num[2] && num[2]==num[3])
		if(num[0]=='0') break;
		else{
		    System.out.println("NA");
		    continue;
		}
	
	    int[] L = new int[4];
	    for(int i=0; i<L.length; i++){
		L[i] = num[i]-48;
		//System.out.println(L[i]);
	    }
	    
	    while(ans!=6174){
		//System.out.println(ans);
		Arrays.sort(L);
		int big=0, small=0;
		int a = 1000;
		for(int i=0; i<4; i++){
		    big += L[i]*a;
		    small += L[3-i]*a;
		    a /= 10;
		}
		//System.out.println(big+" "+small);
		ans = Math.abs(big-small);
		//System.out.println(ans);
		int tmp = ans;
		c++;
		a = 1000;
		for(int i=0; i<4; i++){
		    L[i] = tmp/a;
		    tmp %= a;
		    a /= 10;
		}
	    }
	    System.out.println(c);
	}
    }
}