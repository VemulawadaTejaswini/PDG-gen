import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i = 0;
    while(true){
      int x = sc.nextInt();
      i = i + 1;
      if(x == 1){
        break;
      }else{
        System.out.println("Case "+i+": "+x);
      }
    }
  }
}

