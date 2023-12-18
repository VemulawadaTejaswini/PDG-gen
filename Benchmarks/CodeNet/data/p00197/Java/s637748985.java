import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        new B().doIt();
    }
    class B {
    	String str = "";
    	String dfs(int a,int b,int cnt){
    		if(a % b == 0)str = b+" "+cnt;
    		else dfs(b,a % b,cnt + 1);
    		return str;
    	}
        void doIt(){
        	while(true){
        		int a = sc.nextInt();
        		int b = sc.nextInt();
        		if(a + b == 0)break;
        		if(a > b)System.out.println(dfs(a,b,1));
        		else System.out.println(dfs(b,a,1));
        	}
        }
    }
}