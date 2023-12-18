import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    while(true){
      int a = scan.nextInt();
      int b = scan.nextInt();
      if(a==0 && b==0) break;

      for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
          System.out.print("#");
        }System.out.println();
      }
    }
  }
}

