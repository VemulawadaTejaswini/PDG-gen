import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a > b){
      int x = a;
      a = b;
      b = x;
    }
    if(b > c){
      int y = b;
      b = c;
      c = y;
    }
    if(a > b){
      int z = a;
      a = b;
      b = z;
    }
    System.out.println(a+" "+b+" "+c);
  }
}

