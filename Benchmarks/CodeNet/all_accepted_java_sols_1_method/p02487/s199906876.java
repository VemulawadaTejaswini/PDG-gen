 import java.util.*;
public class Main {
	 public static void main(String[] args){
		         int i,j;
		         Scanner scan = new Scanner(System.in);
		         while(true){
		         int h = scan.nextInt();
		         int w = scan.nextInt();
		         if(h==0&&w==0) break;
		         for(i=0;i<h;i++){
		           for(j=0;j<w;j++){
		        	if((i>0&&i<h-1)&&(j>0&&j<w-1)){
		        		
		            System.out.printf(".");
		        		
		           }else{
		            System.out.printf("#");
		         }
		           }
		   System.out.printf("\n");
		  }
		      System.out.printf("\n");     
		 }
	 }
}
	    