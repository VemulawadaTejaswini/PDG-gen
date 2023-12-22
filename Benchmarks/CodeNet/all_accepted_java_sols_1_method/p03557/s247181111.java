import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] iaary = new long[n];
		long[] ibary = new long[n];
		long[] icary = new long[n];
		long[] kakeary = new long[n];
		long iret = 0;
		int iqx = 0;
		int iqz = 0;
        for(int i=0;i<n;i++){
        	iaary[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
        	ibary[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
        	icary[i] = sc.nextLong();
        }
        Arrays.sort(iaary);
        Arrays.sort(ibary);
        Arrays.sort(icary);
        iret = 0;
        
    	for(int y=0;y<n;y++){
    		for(int x=iqx;x<n;x++){
    			if(iaary[x] >= ibary[y]){
    				kakeary[y] = x;
    				x = n;
    				break;
    			}
    			if(x==n-1){
    				kakeary[y] = x + 1;
    				x = n;
    			}
    			else{
    				iqx++;
    			}
    		}
       		for(int z=iqz;z<n;z++){
    			if(ibary[y] < icary[z]){
    				kakeary[y] *= (n-z);
    				z = n;
    				break;
        		}
    			if(z==n-1){
    				kakeary[y] = 0;
    			}
    			else{
        			iqz++;
    			}
    		}
       		iret += kakeary[y];
    	}
	    System.out.println(iret);
    }
}
