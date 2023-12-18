import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] a;
    int n, z;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    z = -1;
	    a = new int[n+1];

	    for(int i=0; i<=n; i++){
		a[i] = sc.nextInt();
		if(i>0 && a[i] <= a[i-1]) 
		    z = a[i-1];
	    }

	    System.out.println( z!=-1 ? z : 
				a[1]*2-a[0]!=a[2] ? a[0] : a[a.length-1]);
	}
    }
}