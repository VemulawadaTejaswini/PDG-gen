import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] a;
    int ans;
    boolean flag;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    a = new int[n];
	    for(int i=0; i<n; i++)
		a[i] = sc.nextInt();
	    Arrays.sort(a);

	    flag = false;
	    ans = a[n-1];
	    check(ans);
	    while(!flag){
		ans += a[n-1];
		check(ans);
	    }
	    System.out.println(ans);
	}
    }

    void check(int lcm){
	for(int i=0; i<n; i++)
	    if(lcm % a[i] != 0) return;
	flag = true;
    }
}