import java.util.Scanner;
public class Main {
			  public static void main(String[]args){
			    Scanner sc = new Scanner(System.in);
			    int H = sc.nextInt();
			    int W = sc.nextInt();
		              for(int i = 0;i < H;++i) {
		            	 for(int j = 0;j < W;++j){
		            		 if(i%2 == 0 && j%2 == 0) {
		            		  System.out.printf("#");
		            		  }
		            		 if(i%2 == 0 && j%2 == 1) {
		            		  System.out.printf(".");
		            	  }
		            		 if(i%2 == 1 && j%2 == 0) {
		            	      System.out.printf(".");
		            		 }
		            		 if(i%2 == 1 && j%2 == 1) {
		            	  System.out.printf("#");
		            	  }
		            	 }
		        System.out.println("");
			    	  }
			    	sc.close();   
			  }
			}
