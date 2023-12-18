
import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public void run() {
    	TCase:while(true){
    		int n=sc.nextInt();
    		if(n==0)return;
    		int res=0;
    		for(int a=0;a*a<=n;a++)
        		for(int b=a;a*a+b*b<=n;b++)
            		for(int c=b;a*a+b*b+c*c<=n;c++)
            			for(int d=c;a*a+b*b+c*c+d*d<=n;d++){
            	if(a*a+b*b+c*c+d*d==n)res++;
             }
    		ln(res);
    	}
    }
    public static void main(String[] args) {
        new Main().run();
    }

    public int[] nextIntArray(int n){
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=sc.nextInt();
        }
        return res;
    }
    public static void pr(Object o) {
        out.print(o);
    }
    public static void ln(Object o) {
        out.println(o);
    }
    public static void ln() {
        out.println();
    }
}