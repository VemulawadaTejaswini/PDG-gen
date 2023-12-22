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
          System.out.print("#");
        }
        System.out.println("");
      }
        System.out.println("");
    }
     
  }
}
