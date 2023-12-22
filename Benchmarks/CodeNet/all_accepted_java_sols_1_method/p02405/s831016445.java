import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    int h,w;
    Scanner sc = new Scanner(System.in);  
    while(true){
      h = sc.nextInt();
      w = sc.nextInt();
      int i,j;
      if(h==0&&w==0) break;
      for(i=0;i<h;i++){
        if(i%2==0){
          for(j=0;j<w;j++){
            switch(j%2){
              case 0: System.out.printf("#"); break;
              case 1: System.out.printf("."); break;
            }
          }
        }else{
          for(j=0;j<w;j++){
            switch(j%2){
              case 0: System.out.printf("."); break;
              case 1: System.out.printf("#"); break;
            }
          }
        }
        System.out.println();
      }
      System.out.println();
    }
    sc.close();
  }
}
