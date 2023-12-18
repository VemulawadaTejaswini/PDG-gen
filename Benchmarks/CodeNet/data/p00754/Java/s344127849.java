import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();


    public void run() {
    	TCase:while(true){
    		String str=sc.nextLine();
    		if(str.equals("."))return;
    		char[] cs=str.toCharArray();
    		Stack<Character> st=new Stack<Character>();

    		for(char c:cs){
    			switch(c){
	    			case '[':case '(':
	    				st.push(c);
	    				break;
	    			case ']':case ')':
	    				if(st.isEmpty()){
	    					ln("no");continue TCase;
	    				}
	    				char now=st.pop();
	    				if(!((now=='[' && c==']') || (now=='(' && c==')'))){
	    					ln("no");continue TCase;
	    				}
	    			break;
    			}
    		}
    		if(st.isEmpty()){
        		ln("yes");
    		}else{
    			ln("no");
    		}
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