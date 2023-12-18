import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    int wide = sc.nextInt();
    
    for(int i=0;i<height;i++){
      for(int j=0;j<wide;j++){
        System.out.print("#");
      }
      System.out.println("");
    }
  }
}