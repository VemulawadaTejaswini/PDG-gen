import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public void run() {
    	int n=sc.nextInt();
    	while(n--!=0){
    		int c=1;
    		String str=sc.next();
    		Set<String> st=new HashSet<String>();
    		for(int i=1;i<=str.length();i++){
    			String s1=str.substring(0,i);
    			String s2=str.substring(i,str.length());
    			String r1 = (new StringBuffer(s1)).reverse().toString();
				String r2 = (new StringBuffer(s2)).reverse().toString();

				st.add(s1+s2);
				st.add(s2+s1);
				st.add(s1+r2);
				st.add(r2+s1);
				st.add(s2+r1);
				st.add(r1+s2);
				st.add(r1+r2);
				st.add(r2+r1);
    		}
    		ln(st.size());
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