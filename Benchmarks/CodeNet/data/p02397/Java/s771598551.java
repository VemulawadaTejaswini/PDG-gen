import java.util.Scanner;
 
class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
      int x = 0;
      int y = 0;
      x = Integer.parseInt(scan.next());
      y = Integer.parseInt(scan.next());
      if(x == 0 && y ==0){break;
      }
      if(x < y){
        System.out.println(x + " " + y);
      }else{System.out.println(y + " " + x);
      }
    }
  }
}