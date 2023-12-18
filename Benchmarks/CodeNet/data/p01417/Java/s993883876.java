

import java.util.*;
import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    int cardinality(int bits){
	    bits = (bits & 0x55555555) + (bits >> 1 & 0x55555555);
	    bits = (bits & 0x33333333) + (bits >> 2 & 0x33333333);
	    bits = (bits & 0x0f0f0f0f) + (bits >> 4 & 0x0f0f0f0f);
	    bits = (bits & 0x00ff00ff) + (bits >> 8 & 0x00ff00ff);
	    return (bits & 0x0000ffff) + (bits >>16 & 0x0000ffff);
    }


    public void run() {
        int n=sc.nextInt(),m=sc.nextInt();

        double[][] c=new double[n][3];
        for(int i=0;i<n;i++)for(int j=0;j<3;j++){
        	c[i][j]=sc.nextDouble();
        }

        double max=0;
        for(int s=0;s<(1<<n);s++){
        	if(cardinality(s)==m){
            	double val=0;
            	for(int a=0;a<n;a++){
                	for(int b=a+1;b<n;b++)
                	if(((s>>a) & 1)==1 && ((s>>b) & 1)==1)
                		val+=(c[a][0]-c[b][0])*(c[a][0]-c[b][0])+
                		(c[a][1]-c[b][1])*(c[a][1]-c[b][1])+
                		(c[a][2]-c[b][2])*(c[a][2]-c[b][2]);
                }
            	if(max<val)max=val;
        	}
        }
        ln(max);
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