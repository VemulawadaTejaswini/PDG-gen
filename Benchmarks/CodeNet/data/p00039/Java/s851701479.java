import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    String s;
    int i, ans, sum, x, y;

    void run(){
	while(sc.hasNext()){
	    s = sc.next();
	    ans = 0;
	    sum = 0;
	    x = change(s.substring(0, 1));
	    for(i=1; i<s.length(); i++){
		y = change(s.substring(i, i+1));
		//System.out.println(x+" "+y);
		if(x>y){
		    ans += (x+sum);
		    sum = 0;
		}
		else if(x<y){
		    ans -= (x+sum);
		    sum = 0;
		}
		else if(x==y){
		    sum += x;
		}
		x = y;
		//System.out.println("*"+ans+" "+sum);
	    }
	    ans += (y+sum);
	    if(ans<0) ans = (-1)*ans;
	    System.out.println(ans);
	}
    }

    int change(String a){
	if(a.equals("I"))
	    return 1;
	else if(a.equals("V"))
	    return 5;
	else if(a.equals("X"))
	    return 10;
	else if(a.equals("L"))
	    return 50;
	else if(a.equals("C"))
	    return 100;	
	else if(a.equals("D"))
	    return 500;
	else if(a.equals("M"))
	    return 1000;
	return 0;  // エラー扱い
    }
}