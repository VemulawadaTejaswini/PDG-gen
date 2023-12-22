import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x,y,z=1;
    x = scanner.nextInt();
    y = scanner.nextInt();

    while(!(z==0)){
      if(x<y){
        z=x;
        x=y;
        y=z;
      }
      z = x % y;
      if(z==0){
        System.out.println(y);
      }
      x = y;
      y = z;
    }
  }
}

