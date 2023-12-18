import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int x , y ;
    Scanner sc = new Scanner(System.in);
    for(int i =0 ; ; ){
      x = sc.nextInt();
      y = sc.nextInt();
      if (x==0 && y==0){
        break;
      } else if (x<=y){
        System.out.println(x+" "+y);
      } else {
        System.out.println(y+" "+x);
      }
    }
  }
}