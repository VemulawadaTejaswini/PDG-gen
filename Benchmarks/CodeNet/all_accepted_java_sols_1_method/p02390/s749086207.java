import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y, z, w;
    y = x / 3600;
    z = (x % 3600) / 60;
    w = (x%3600) % 60;
    System.out.println(y + ":" + z + ":" + w);
  }
}
