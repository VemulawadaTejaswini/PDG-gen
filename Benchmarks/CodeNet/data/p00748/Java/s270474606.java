
import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();



    public void run() {
    	List<Integer> pollock=new ArrayList<Integer>();

    	for(int i=1;i*(i+1)*(i+2)/6<1000000;i++){
    		pollock.add(i*(i+1)*(i+2)/6);
    	}

    	while(true){
        	int n=sc.nextInt();
        	if(n==0)return;

        	int n1=n,n1c=10;

        	for(int i1=0;i1<=n;i1++){
        		int v1=pollock.get(i1);
        		if(v1==n1)n1c=Math.min(1,n1c);
        		for(int i2=i1;i2<=n-i1;i2++){
            		int v2=pollock.get(i2);
            		if(v1+v2==n1)n1c=Math.min(2,n1c);
        			for(int i3=i2;i3<=n-i1-i2;i3++){
                		int v3=pollock.get(i3);
                		if(v1+v2+v3==n1)n1c=Math.min(3,n1c);
        				for(int i4=i3;i4<=n-i1-i2-i3;i4++){
                    		int v4=pollock.get(i4);
                    		if(v1+v2+v3+v4==n1)n1c=Math.min(4,n1c);
        					for(int i5=i4;i5<=n-i1-i2-i3-i4;i5++){
                        		int v5=pollock.get(i5);
                        		if(v1+v2+v3+v4+v5==n1)n1c=Math.min(5,n1c);
        					}
        				}
        			}
        		}
        	}
        	int n2=n,n2c=0;
        	for(int j=pollock.size()-1;j>=0;j--){
        		int v=pollock.get(j);
        		if(v%2==1){
        			while(n2>=v){
	        			n2-=v;
        				n2c++;
        			}
        			if(n2==0){
        				break;
        			}
        		}
        	}

        	ln(n1c+" "+n2c);

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