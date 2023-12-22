import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int all = 0;
    for(int i=1; i<=n; i++) {
    	if(i < 10) {
    		if(a<=i && i<=b) {
    			all += i;
    		}
    	}else if(i < 100) {
    		if(a <= i/10 + i%10	&&	i/10 + i%10	<=b) {				
    			all += i;
    		}
        }else if(i < 1000) {
        		if(a <= i/100 + (i%100)/10 + (i%10)	&& i/100 + (i%100)/10 + (i%10) <= b) {				
        			all += i;
        		}
        }else if(i < 10000) {
            	if(a <=	i/1000 + (i%1000)/100 + ((i%1000)%100)/10 +(i%10) && i/1000 + (i%1000)/100 + ((i%1000)%100)/10 +(i%10) <= b) {
            		all += i;
            	}
        }else {
        		if(a <= i/10000 + (i%10000)/1000 + (i%1000)/100 + ((i%1000)%100)/10  + i%10 && i/10000 + (i%10000)/1000 + (i%1000)/100 + ((i%1000)%100)/10  + i%10 <= b) {
        			all += i;
        	}
    }
    }
    	System.out.println(all);
      }
}