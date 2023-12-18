import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char c = '#';
    char d = '.';
    while(true){
      int height = sc.nextInt();
      int wide = sc.nextInt();
 
      if(height == 0 || wide == 0){
        break;
      }
 
      for(int i =0;i<wide;i++){
        System.out.print(c);
      }
      System.out.println();

      for(int i=0;i<height-2;i++){
        System.out.print(c);
        for(int j=0;j<wide-2;j++){
          System.out.print(d);
        }
        System.out.println(c);
      }

      for(int i =0;i<wide;i++){
        System.out.print(c);
      }
      System.out.println("");
      System.out.println("");
    }
  }
}