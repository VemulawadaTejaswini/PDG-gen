import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }

    static void solve(){
	double a = kbd.nextDouble();
	double b = kbd.nextDouble();
	int n = kbd.nextInt();
	
	String s = Double.toString(a/b);
	//System.out.println(a/b);

	int ans=0;
	int d=0, i;
	while(!s.substring(d, d+1).equals(".")) d++;
	d+=1;
	for(i=d; i<s.length()&&i<n+d; i++){
	    ans += Integer.parseInt(s.substring(i, i+1));
	}

	System.out.println(ans);
    }
}