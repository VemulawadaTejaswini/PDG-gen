import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    String ans;
    int k;
    String n;
    String m;
    int[] num;
    boolean carry;

    void run(){
	while(sc.hasNext()){
	    k = sc.nextInt();
	    while(k>0){
		// 各数字を0付きの80桁に揃える
		n = sc.next();
		while(n.length()<80)
		    n = "0"+n;
		m = sc.next();
		while(m.length()<80)
		    m = "0"+m;
		num = new int[80];
		ans = "";
		carry = false;
		if(n.length()>80 || m.length()>80) {
		    System.out.println("overflow");
		}
		else solve();
		k--;
	    }
	}
    }

    void solve(){
	int i;
	for(i=79; i>=0; i--){
	    num[i] = Integer.parseInt(n.substring(i, i+1));
	    //System.out.print(num[i]);
	}
	//System.out.println();
	for(i=79; i>=0; i--){
	    if(carry){
		num[i]++;
		carry = false;
	    }
	    num[i] += Integer.parseInt(m.substring(i, i+1));
	    if(num[i] >=10){
		carry = true;
		num[i] -= 10;
	    }
	    //System.out.print(num[i]);
	}
	//System.out.println();
	if(carry){
	    ans = "overflow";
	}
	else{
	    i=0;
	    while(num[i]==0)i++;
	    for(; i<num.length; i++)
		ans += Integer.toString(num[i]);
	}
	System.out.println(ans);
    }
}