import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int x2000 = sc.nextInt();

    int sum[];
    sum = new int[100];
    sum[0] = (r*x2000)-D;

    for(int i = 1;i < 11;i++){
      sum[i] = (r*sum[i-1])-D;
    }
    for(int n = 0;n < 10;n++){
      System.out.println(sum[n]);
    }
  }
}
