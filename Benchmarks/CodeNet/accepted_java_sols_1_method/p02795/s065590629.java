import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();
    int out = 0;

    if(h>w && n%h!=0){
      out = n/h + 1;
    }else if(h>w && n%h==0){
      out = n/h;
    }else if(h<=w && n%w!=0){
      out = n/w +1;
    }else if(h<=w && n%w==0){
      out = n/w;
    }

    System.out.println(out);
  }
}
