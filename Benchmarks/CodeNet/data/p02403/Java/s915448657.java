import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a == 0 && b == 0){ break;}

      for(int i = 0; i++; i < a){
        for(int j = 0; j++; j < b){
          System.out.print("#");
        }
        System.out.println();
      }
    }
  }
} 