import java.util.Scanner;

class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  char hash = '#';
  char dot = '.';
  while(true){
    int h = sc.nextInt();
    int w = sc.nextInt();

    for(int i=0;i<h;i++){
      if(i%2 == 0){
        for(int j=0;j<w;j++){
          if(j%2 == 0){
            System.out.print(hash);
          }else{
            System.out.print(dot);
          }
        }
      }else{
        for(int j=0;j<w;j++){
          if(j%2 == 1){
            System.out.print(hash);
          }else{
            System.out.print(dot);
          }
        }
      }
      System.out.println("");
    }
  }
  }
}