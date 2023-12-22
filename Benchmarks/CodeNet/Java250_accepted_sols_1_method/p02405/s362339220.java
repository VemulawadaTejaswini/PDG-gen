import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i,j,width,height;
      while(true){
        height = sc.nextInt();
        width = sc.nextInt();
        if(height == 0 && width == 0){
          break;
        }
        for(i = 1;i <= height;i++){
          for(j = 1;j <= width;j++){
            if((i + j) % 2 == 0){
              System.out.print("#");
            }
            else{
              System.out.print(".");
            }
          }
          System.out.println();
        }
        System.out.println();
      }
  }
}