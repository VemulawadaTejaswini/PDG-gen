import java.util.*;


public class Main {
	static int w;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
          int h=sc.nextInt();
          w=sc.nextInt();
          if(h==0&&w==0)break;
          mm();
          for(int  i=0;i<h-2;i++){
        	 System.out.print("#");
        	 for(int j=0;j<w-2;j++){
        	    	System.out.print(".");  	
            	}
        	 System.out.println("#"); 
           }
          mm();
          System.out.println();
          
        }
			
    }
    static void mm(){
    	for(int j=0;j<w;j++){
    		System.out.print("#");
    		
    	}
    	System.out.println();
    }
}