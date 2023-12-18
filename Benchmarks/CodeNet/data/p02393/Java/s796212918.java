import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int x;

    if(a>b){
      x=a; a=b; b=x;
    }
    if(b>c){
      x=b; b=c; c=x;
    }
    if(a>b){
      x=a; a=b; b=x;
    }

    System.out.println(a+" "+b+" "+c);

  }
}

