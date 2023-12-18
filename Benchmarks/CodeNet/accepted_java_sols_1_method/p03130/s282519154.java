import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    		
    		int p[] = new int[4];
    		for(int i = 0; i<3; i++){
    			int extract1 = sc.nextInt()-1;
    			int extract2 = sc.nextInt()-1;
    			p[extract1]++;
    			p[extract2]++;
    			
    			
    		}
    		int twice =0;
    		int thrad = 0;
    		int one =0;
    		
    		boolean zero = false;
    		for(int c=0; c<4; c++) {
    			if(p[c]==0) {zero=true;	break;}
    			if(p[c]==1) one+=1;
    			if(p[c]==2) twice +=1;
    			if(p[c]==3) thrad+=1;
    			
    			
    		}
    		
    			if(zero==true) {
    				System.out.println("NO");
    			}else {
    				if(twice==2&&one==2)System.out.println("YES");
    				else if(thrad==1&&one==3)System.out.println("NO");
    				else System.out.println("NO");
    			}
    			
    		}
    		
    		
    		
    		
    	
    		
    		}
    