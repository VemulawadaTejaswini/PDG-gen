import java.util.Scanner;

class Watch{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int S = sc.nextInt();
    int a = S % 3600;
    int b = a % 60;

    int h = (S - a) / 3600;
    int m = (a - b) / 60;
    int s = b;
    System.out.println(h + ":" + m + ":" + s);
  };
}