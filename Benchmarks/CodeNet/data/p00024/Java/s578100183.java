import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    // 整数秒である必要はない
    double min, v, y, t;
    int ans;

    void run(){
	while(sc.hasNext()){
	    min = sc.nextDouble();
	    
	    v=0; t=0;
	    while(min>v){
		t += 0.01;
		v = 9.8*t;
		//System.out.println(v);
	    }

	    y = t*t*4.9;
	    ans = 0;
	    while(5*ans-5 < y){
		ans++;
		//System.out.println(ans+" "+(5*ans-5)+" "+y);
	    }

	    //System.out.println(v+" "+y+" "+t);
	    System.out.println(ans);
	}
    }
}
       