import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
    label:
    while(sc.hasNextLine()){
      int h = sc.nextInt();
      int w = sc.nextInt();
       
      if(h==0 && w==0) break label;
      for(int j = 1; j<=h; j++){
        for(int i = 1; i<=w; i++){
          if(j == 1 || j == h){
            System.out.print("#");
          }else{
            if(i == 1 || i == w){
              System.out.print("#");
            }else{
              System.out.print(".");
            }
          }
        }
        System.out.println("");
      }
        System.out.println("");
    }
     
  }
}
