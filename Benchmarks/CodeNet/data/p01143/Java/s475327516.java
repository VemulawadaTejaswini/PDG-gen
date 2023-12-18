import java.util.*;

public class Main{
    int n,m,p;
    int[] x;

    public static void main(String[] args){
	new Main().calc();
    }

    void calc(){
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	while(n!=0){
	    m = sc.nextInt();
	    p = sc.nextInt();
	    x = new int[n];
	    int sum = 0;
	    for(int i=0; i<n; i++){
		x[i] = sc.nextInt();
		sum += x[i];
	    }
	    
	    double ans = 0;
	    if(x[m-1]!=0)ans = (sum*(100-p))/x[m-1];
	    
	    System.out.println((int)ans);
	    
	    n = sc.nextInt();
	}
    }
}