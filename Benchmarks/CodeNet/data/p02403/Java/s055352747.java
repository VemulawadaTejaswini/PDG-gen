	import java.util.Scanner;
	public class Main{
			  public static void main(String[]args){
			    Scanner sc = new Scanner(System.in);
			    
			    	while(true) {
			    int H = sc.nextInt();
			    int W = sc.nextInt();
		              for(int i = 0;i < W;++i) {
		            	  for(int j = 0;j < H;++j) {
		            		  System.out.printf("#");      		 
		            	  }
		            	  System.out.println("");
		            	  }
		        System.out.println("");
		        if(H == 0 && W == 0) break;
			    	  }
			    
			    
			    	sc.close();   
			  }
			}
