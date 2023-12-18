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
                	 if(i%2==0){
                      for(j=0;j<w;j++){
                    	  if(j%2==0){
                        System.out.printf("#");
                       }else{
                        System.out.printf(".");
                      }  
                   }
                	 }else{
                		 for(j=0;j<w;j++){
                			 if(j%2==0){
                				 System.out.printf(".");
                			 }else{
                				System.out.printf("#"); 
                			 }
                		 }
                	 }
          
              System.out.printf("\n");     
         }
                 System.out.printf("\n");
     }
}
}