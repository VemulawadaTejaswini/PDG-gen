import java.util.*;

public class Main {
    static int n, w[]={1,2,4,8,16,32,64,128,256,512};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            n = sc.nextInt();
            
            int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0};
            int i=10, j=0;
            
            while(0<n&&0<=i){
            	if(w[--i]<=n){
            		a[i]=1;
            		n-=w[i];
            		++j;
            	}
            }
    		for(i=0,--j; i<10&&0<j; ++i)
    			if(1==a[i]){
    				System.out.print(w[i]);
    				System.out.print(" ");
    				--j;
    			}

    		for(; i<10; ++i)
    			if(1==a[i]){
    				System.out.println(w[i]);
    			}
        }
    }
 

}