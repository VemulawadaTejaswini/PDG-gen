import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x , y , z,c;
    x = sc.nextInt();
    y = sc.nextInt();
    z = sc.nextInt();
    c = x;
    x = y;
    y = c;

    c = x;
    x = z;
    z = c;
    System.out.println(x+" "+y+ " "+z);

  }
}
