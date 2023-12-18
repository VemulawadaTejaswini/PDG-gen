import java.util.Scanner;

class Main{

  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);

    int x = stdIn.nextInt();
    int y = stdIn.nextInt();
    if(y > x){
      int tmp = x;
      x = y;
      y = tmp;
    }
    System.out.println(gcd(x, y));
  }


  static int gcd(int x, int y){
    if(x % y == 0){
		  return(y);
    }
	  else{
		  return(gcd(y, x % y));
    }
  }
}

