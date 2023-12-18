import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a == 0){
        break;
      }else{
        for(int i=0;i<a;i++){
          if(i==0||i==a-1){
            for(int j=0;j<b;j++){
              System.out.print("#");
            }
            System.out.println("");
          }else{
          for(int j=0;j<b;j++){
            if(j==0||j==b-1){
              System.out.print("#");
            }else{
              System.out.print(".");
            }
          }
          System.out.println("");
          }
        }
        System.out.println("");
      }
    }
    sc.close();
  }
}
