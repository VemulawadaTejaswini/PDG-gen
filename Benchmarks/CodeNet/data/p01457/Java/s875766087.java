

import java.util.*;
import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public void run(){
    	int q=sc.nextInt();

    	long LC=0,RC=0;

    	while(q--!=0){
        	int p=sc.nextInt(),c=sc.next().charAt(0),n=sc.nextInt();
        	if(c=='(')
        		LC+=n;
        	else
        		RC+=n;

        	ln((LC==RC)?"Yes":"No");
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