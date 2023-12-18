import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int x,n;
	int ans = 0;
	x = sc.nextInt();
	n = sc.nextInt();
	int[] p = new int[n];
	for(int i=0;i<n;i++){
	    p[i] = sc.nextInt();
	}
	//bubblesort
	int tmp = 0;
        for(int i=0;i<n-1;i++){
	    if(p[i]>p[i+1]){
		tmp = p[i];
		p[i] = p[i+1];
		p[i+1] = tmp;
	    }
	}
	//p[] sorted
	ans = x;
	if(n>0){
	    ans = 0;
	    boolean hako[] = new boolean[p[n-1]+1];
	    for(int i=0;i<n;i++){
		hako[p[i]] = true;
	    }
	    for(int i=1;i<p[n-1];i++){
		if(!(hako[i])&&Math.abs(x-i)<Math.abs(ans-x)){
		    ans = i;
		}
	    }
	}
	System.out.println(ans);
    }
}
