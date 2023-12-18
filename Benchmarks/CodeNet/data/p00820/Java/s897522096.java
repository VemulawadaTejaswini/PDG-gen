import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public int getC(int a,int min,int n){
    	if(a>4)return 0;
    	if(n==0)return 1;
    	int val=0;
    	for(int j=min;j*j<=n;j++){
    		val+=getC(a+1,j,n-j*j);
    	}
    	return val;
    }

    public void run() {
    	TCase:while(true){
    		int n=sc.nextInt();
    		if(n==0)return;
    		ln(getC(0,1,n));
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