import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, max;
    int[] a;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    a = new int[n];
	    max = 0;
	    for(int i=0; i<n; i++)
		a[i] = sc.nextInt();

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