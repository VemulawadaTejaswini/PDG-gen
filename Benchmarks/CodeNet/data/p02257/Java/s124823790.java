import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, count;
    boolean[] p;
    boolean[] appear;

    void run(){
	count = 0;
	p = new boolean[100000];
	setP();
	appear = new boolean[100000];
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(p[n] && !appear[n]) {
		count++;
		appear[n] = true;
	    }
	}
	System.out.println(count);
    }  

    void setP(){
	Arrays.fill(p, true);
	p[0] = p[1] = false;
	for(int i=2; i<p.length; i++)
	    for(int j=i*2; j<p.length; j+=i)
		p[j] = false;
    }
}