import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int n=stdIn.nextInt();
    int y=(n/15)*200;
    int x=n*800;
    System.out.println(x-y);
  }
}
    