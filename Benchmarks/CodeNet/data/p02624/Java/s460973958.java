
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int sum=1;
	    for(int i=2;i<=n;i++)
	    sum+=i*f(i);

        System.out.println(sum);
	}
    public static int f(int n)
    {
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        if(n%i==0)
        c++;
        
        return c+1;
    }
}
