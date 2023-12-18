import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int t = kbd.nextInt();
	    if(t!=0){
		solve(t);
	    }
	}
    }
  
    static void solve(int t){
	int dotime = 0;
	int n = kbd.nextInt();
	while(n>0){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    dotime += (b-a);
	    n--;
	}
	if(dotime >= t)
	    System.out.println("OK");
	else 
	    System.out.println(t - dotime);
    }
}