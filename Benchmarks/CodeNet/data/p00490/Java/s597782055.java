import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[] aa = new int[10000];

	int res = 0,sum = 0;
	int n,a,b,c;
	n = sc.nextInt();
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();

	for(int i=0; i<n; i++){
	    aa[i] = sc.nextInt();
	}

	Arrays.sort(aa);
	//Arrays.reverse(aa);
	for(int i=0; i<=n/2; i++){
	    int tmp = aa[i];
	    aa[i] = aa[aa.length-1-i];
	    aa[aa.length-1-i] = tmp;
	}

	for(int i=0; i<n+1; i++){
	    res = Math.max(res,(c+sum)/(a+b*i));
	    if(i==n)break;
	    sum += aa[i];
	}
	System.out.println(res);
    }
}