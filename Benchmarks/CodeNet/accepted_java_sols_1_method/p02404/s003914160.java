import java.util.Scanner;

class Main{

    public static void main(String[] args){
    
      Scanner sc =new Scanner(System.in);

      while(true){
      int H=sc.nextInt();
      int W=sc.nextInt();
      
      if(H==0&&W==0) break;
          
          
      if(H<=2||W<=2) 
      for(int i=0;i<H;i++){
       for(int j=0;j<W;j++)
        System.out.print("#");
        System.out.print("\n");
      }
      
      else{
      for(int i=0;i<W;i++)
      System.out.print("#");
      System.out.print("\n");
      for(int i=1;i<H-1;i++){
      System.out.print("#");
      for(int j=1;j<W-1;j++)
      System.out.print(".");
      System.out.print("#");
      System.out.print("\n");
      }
      for(int i=0;i<W;i++)
      System.out.print("#");
      System.out.print("\n");
      }
      
      System.out.print("\n");
     
}
}

}
