import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.valueOf(scan.next());
        Integer[] ns = new Integer[n];
        for(int i=0;i<n;i++) {
        	ns[i] = Integer.valueOf(scan.next());
        }
        for(int i = 1;i<=ns.length-1;i++) {
        	int cnt=0;
    	    for(int val:ns) {
    	    	if(cnt==n-1) break;
    	    	System.out.print(val+" ");
    	    	cnt++;
    	    }
    	    System.out.println(ns[n-1]);
    	    int key = ns[i];
    	    int j = i - 1;
    	    while(j >= 0 && ns[j] > key) {
    	        ns[j+1] = ns[j];
    	        j--;
    	    }
    	    ns[j+1] = key;
        }
        int cnt=0;
	    for(int val:ns) {
	    	if(cnt==n-1) break;
	    	System.out.print(val+" ");
	    	cnt++;
	    }
	    System.out.println(ns[n-1]);
        scan.close();
    }
}
