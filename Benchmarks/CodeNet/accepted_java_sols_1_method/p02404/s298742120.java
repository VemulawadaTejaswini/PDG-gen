import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
int i = 0;
    for(;;){
      int h = sc.nextInt();
      int w = sc.nextInt();

      if(h == 0 && w == 0) break;

      for( i = 0;i < h ;i++){
        for(int p = 0; p < w; p++){
        System.out.print("#");

        //System.out.println("i = "+i+";");
        if((i != 0) && (i != h-1)){
            for(int q = 0;q<w-2;q++){
              //System.out.println("i :"+i+" ");
              System.out.print(".");

            }//q
            System.out.print("#");
            break;
          }else{
            //System.out.println("else");
        }



        }//p
        System.out.println("");
      }//i
      System.out.println("");

    }//for;;

  }//main


}//class
