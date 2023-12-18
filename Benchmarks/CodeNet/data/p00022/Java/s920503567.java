import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    long[] a;
    long max;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    a = new long[n];
	    max = 0;
	    for(int i=0; i<n; i++)
		a[i] = sc.nextLong();

	    for(int first=0; first<n; first++){
		int p=first, sum=0;
		for(int end=first; end<n; end++){
		    sum += a[p];
		    max = Math.max(max, sum);
		    p++;
		}
	    }

	    System.out.println(max);
	}
    }
}