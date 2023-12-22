import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=a-b;
    int n=c-d;
    if(n<0)
    {
      n=0;
    }
    System.out.print(n);

  }
}