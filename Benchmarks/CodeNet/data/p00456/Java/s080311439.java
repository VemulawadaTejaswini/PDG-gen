import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int[] w, k;
    int ww, kk;
    void run(){
	while(sc.hasNext()){
	    int i;
	    w = new int[10];
	    k = new int[10];
	    put(w);
	    put(k);
	    ww = w[9]+w[8]+w[7];
	    kk = k[9]+k[8]+k[7];
	    System.out.println(ww+" "+kk);
	}
    }

    void put(int[] a){
	for(int i=0; i<10; i++)
	    a[i] = sc.nextInt();
	Arrays.sort(a);
    }
}