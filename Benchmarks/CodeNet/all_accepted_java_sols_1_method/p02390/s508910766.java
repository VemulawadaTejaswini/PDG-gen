import java.util.Scanner;

class Main{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int H = x / 3600;
    int M = (x - H * 3600) / 60;
    int S = (x - H * 3600) - (M * 60);

    System.out.println(H + ":" + M + ":" + S);
    sc.close();
  }
}