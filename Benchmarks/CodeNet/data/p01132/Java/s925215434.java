import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new A().doIt();
    }
    class A{
    	void dp(int base[]){
    		Arrays.fill(base,10000);
    		base[0] = 0;
    		for(int i = 10;i <= 500;i += 10){
    			if(i >= 100)base[i] = Math.min(base[i],base[i-100]+1);
    			else if(i >= 50)base[i] = Math.min(base[i],base[i-50]+1);
    			else base[i] = Math.min(base[i],base[i-10]+1);
//    			System.out.print(base[i]+" ");
    		}
    	}
        void doIt(){
        	int base[] = new int [501];
        	boolean first = true;
        	dp(base);
        	while(true){
        		int n = sc.nextInt();
        		if(n == 0)break;
        		if(!first)System.out.println();
        		int a[] = new int [4];
        		for(int i = 0;i < 4;i++){
        			a[i] = sc.nextInt();
        		}
        		int coin = 10000;
        		int ans[] = new int [4];
        		for(int i = 0;i <= a[0];i++){
        			for(int j = 0;j <= a[1];j++){
        				for(int k = 0;k <= a[2];k++){
        					for(int l = 0;l <= a[3];l++){
        						int num = i*10+j*50+k*100+l*500;
        						if(num < n || num - n > 500)continue;
        						else{
//        							System.out.println(base[num - n]+" "+num+" "+n+" "+coin);
        							if(base[num - n] < coin){
        								coin = base[num - n];
        								ans[0] = i;ans[1] = j;ans[2] = k;ans[3] = l;
        							}
        						}
        					}
        				}
        			}
        		}
        		if(ans[0] > 0)System.out.println(10+" "+ans[0]);
        		if(ans[1] > 0)System.out.println(50+" "+ans[1]);
        		if(ans[2] > 0)System.out.println(100+" "+ans[2]);
        		if(ans[3] > 0)System.out.println(500+" "+ans[3]);
        		first = false;
        	}
        }
    }
}