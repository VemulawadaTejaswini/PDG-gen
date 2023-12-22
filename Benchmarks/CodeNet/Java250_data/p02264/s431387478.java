import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int q = scan.nextInt();
    	int[] tqueue = new int[n];
    	String[] nqueue = new String[n];
    	int start = 0;
    	int end = n - 1;
    	int now = 0;
    	int how = n;
    	
    	for(int i = 0; i < n; i++){
    		nqueue[i] = scan.next();
    		tqueue[i] = scan.nextInt();
    	}
    	
    	while(how > 0){
    		if(tqueue[start] <= q){
    			now += tqueue[start];
    			System.out.println(nqueue[start]+" "+now);
    			start = (start + 1)%n;
    			how--;
    		}else{
    			now += q;
    			end = (end + 1)%n;
    			tqueue[end] = tqueue[start] - q;
    			nqueue[end] = nqueue[start];
    			start = (start + 1)%n;
    		}
    	}
    }
}
