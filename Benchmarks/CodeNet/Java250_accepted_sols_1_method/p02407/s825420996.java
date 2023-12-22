import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,x;
    int [] num = new int[101];
    x = sc.nextInt();
    for(i = 0;i < x;i++){
      num[i] = sc.nextInt();
    }
    while(true){
      i--;
      if(i <= 0){
        System.out.print(num[i]);
        break;
      }
      System.out.print(num[i] + " ");
    }
    System.out.println();
  }
}