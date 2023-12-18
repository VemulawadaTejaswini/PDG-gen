import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int h = sc.nextInt();
      int w = sc.nextInt();
      int i,j;
      for(i=0;i<h;i++){
        if(i==0||i==h-1){
          for(j=0;j<w;j++){
            System.out.printf("#");
          }
        }else{
          System.out.printf("#");
          for(j=1;j<w-1;j++){
            System.out.printf(".");
          }
          System.out.printf("#");
        }
        System.out.printf("\n");
      }
      if(h==0 && w==0) break;
      System.out.printf("\n");
    }
    sc.close();
  }
}
