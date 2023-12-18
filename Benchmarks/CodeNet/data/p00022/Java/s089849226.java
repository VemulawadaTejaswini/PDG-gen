import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, w;
    double[] bar;
    double ans;
    
    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    w = sc.nextInt();
	    if(n==0 && w==0) break;

	    double max = 0;
	    bar = new double[100/w+1];
	    for(int i=0; i<n; i++)
		bar[(int)sc.nextInt()/w]++;

	    for(int i=0; i<bar.length; i++)
		max = Math.max(max, bar[i]);
	    
	    
	    for(int i=0; i<bar.length; i++)
		bar[i] = bar[i]/max;
       

	    double ans = 0;
	    int length = bar.length-1;
	    while(bar[length]==0) length--;
	    int c = length;
	    for(int i=0; c>=0; i++){
		bar[i] = bar[i]*c/length;
		ans += bar[i];
		c--;
	    }
	    ans += 0.01;

	    System.out.println(ans);
	}
    }

    void show(){
	for(int i=0; i<bar.length; i++)
	    System.out.print(bar[i]+" ");
	System.out.println();
    }
}