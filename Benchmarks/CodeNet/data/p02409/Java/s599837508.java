import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int i,j,k,n,b,f,r,v;
    int [][] one = new int[3][10];
    int [][] two = new int[3][10];
    int [][] three = new int[3][10];
    int [][] four = new int[3][10];
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i = 0;i < 3;i++){
      for(j = 0;j < 10;j++){
        one[i][j] = 0;
        two[i][j] = 0;
        three[i][j] = 0;
        four[i][j]  = 0;
      }
    }
    for(i = 0;i < n;i++){
      b = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      v = sc.nextInt();
      if(b == 1){
        one[f - 1][r - 1] += v;
      }
      else if(b == 2){
        two[f - 1][r - 1] += v;
      }
      else if(b == 3){
        three[f - 1][r - 1] += v;
      }
      else if(b == 4){
        four[f - 1][r - 1] += v;
      }
    }
    for(i = 0;i < 3;i++){
      for(j = 0;j < 10;j++){
          System.out.print(" " + one[i][j]);
      }
      System.out.println();
    }
    System.out.println("####################");

    for(i = 0;i < 3;i++){
      for(j = 0;j < 10;j++){

          System.out.print(" " + two[i][j]);
      }
      System.out.println();
    }

    System.out.println("####################");

    for(i = 0;i < 3;i++){
      for(j = 0;j < 10;j++){
          System.out.print(" " + three[i][j]);
      }
      System.out.println();
    }
    System.out.println("####################");

    for(i = 0;i < 3;i++){
      for(j = 0;j < 10;j++){
          System.out.print(" " + four[i][j]);
      }
      System.out.println();
    }
  }
}