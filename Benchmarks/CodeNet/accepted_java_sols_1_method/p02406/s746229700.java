import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i,j,x;
    x = sc.nextInt();
    for(i = 1;i <= x;i++){
      if(i % 3 == 0){
        System.out.print(" " + i);
      }
      else{
        j = i;
        while(j > 0){
          if(j % 10 == 3){
            System.out.print(" " + i);
            break;
          }
          j /= 10;
        }

      }
    }
    System.out.println();
  }
}