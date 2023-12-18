import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    long sum, n;
    int x, y, h, w;
    int len;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextLong();
	    sum = 0;
	    if(n!=0) solve();
	}
    }

    void solve(){
	while(n>0){
	    n--;
	    x = sc.nextInt();
	    y = sc.nextInt();
	    h = sc.nextInt();
	    w = sc.nextInt();
	    len = x+y+h;
	    sum += fee();
	}
	System.out.println(sum);
    }

    int fee(){
	if(h<=60 && w<=2)
	    return 600;
	else if(h<=80 && w<=5)
	    return 800;
	else if(h<=100 && w<=10)
	    return 1000;
	else if(h<=120 && w<=15)
	    return 1200;
	else if(h<=140 && w<=20)
	    return 1400;
	else if(h<=160 && w<=25)
	    return 1600;
	return 0;
    }
}
	