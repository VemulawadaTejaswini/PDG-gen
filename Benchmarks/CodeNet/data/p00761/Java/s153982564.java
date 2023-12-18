import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	int cn(int n,int m){
    		int a[] = new int [m];
    		for(int i = 0;i < m;i++){
    			a[i] = n % 10;
    			n = n / 10;
    		}
    		Arrays.sort(a);
    		for(int i = 0;i < m;i++){
    			n = n * 10;
    			n = n + a[m - i - 1] - a[i];
    		}
    		return n;
    	}
        void doIt(){
        	while(true){
        		TreeSet<Integer> ts = new TreeSet<Integer>();
        		ArrayList<Integer> array = new ArrayList<Integer>();
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		int cnt = 0;
        		if(n + m == 0)break;
        		while(ts.add(n)){
        			array.add(n);
//        			System.out.println(n);
        			n = cn(n,m);
        			cnt++;
        		}
        		for(int i = 0;i < n;i++){
        			if(n == array.get(i)){
        				System.out.println(i+" "+n+" "+(cnt-i));
        				break;
        			}
        		}
        		if(n == 0)System.out.println((array.size()-1)+" "+0+" "+(cnt-array.size()+1));
        	}
        }
    }
}