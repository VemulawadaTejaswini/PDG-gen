import java.util.Scanner;

class Main{
  private static int H,W;

  public static void main(String[] args){
    
    Scanner s= new Scanner(System.in);
   
   while(true){
   H=s.nextInt();
   W=s.nextInt();
   
   if(H==0&&W==0){
       break;
   }
   for(int i = 0;i<H;i++){
       
       for(int x=0;x<W;x++){
           
           System.out.println("#");
           if(x>1&&x<H-1){
               for(int o=x+1;o<W-1;o++)
                  System.out.println(".");
           }
       }
       System.out.println(" ");
       
   }System.out.println(" ");
   
  }
  }   
      
  }
