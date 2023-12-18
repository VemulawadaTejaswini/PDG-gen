import java.util.*;

class Main{

    public static void main(String[] args)
    {
	int t,n,m,p,q,v;
	double ki=0,tai=0,maxx=0,r;

	Scanner in = new Scanner(System.in);	

	t = in.nextInt();
	for(int j=0;j<t;j++)
	    {
		n = in.nextInt();
		m = in.nextInt();
		n = n + 1;
		n = n - 1;
		ki = 0;
		tai = 0;
		for(int i=0;i<m;i++){
		    v = in.nextInt();
		    r = in.nextDouble();
		    ki = ki + v*r;
		    tai += r;
		}
		maxx = Math.max(maxx,ki/tai);
	    }
		ki = 0;
		tai = 0;
		p = in.nextInt();
		q = in.nextInt();
		p = p + 1;
		p = p -1;
		for(int i=0;i<q;i++)
		    {
			v = in.nextInt();
			r = in.nextDouble();
			ki+=v*r;
		tai+=r;
		    }
		double hell;
		hell = ki/tai;
		if(maxx+0.0000001<hell)System.out.println("NO");
		else System.out.println("YES");
		
    }
}